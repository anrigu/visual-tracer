package com.github.anrigu.random.gen;

import submitcode.RecordableArray;
import submitcode.Search;
import submitcode.Sort;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Arrays;

/**
 * A class that handles the user code
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class CustomSorting {

  /**
   * Runs the user code
   *
   * @param file - The file path
   * @param folder - The folder path
   * @param algorithm - The given algorithm (sort or search)
   *
   * @return - A response object holding a recordable array, the search value and any errors
   */
  public Response run(String folder, String file, String algorithm) {
    Response response = new Response();
    try {
      //String source = "package test; public class Test { static { System
      // .out.println(\"hello\"); } public Test() { System.out.println
      // (\"world\"); } }";

      // Save source in .java file.
      File root = new File(folder); // On Windows running on C:\, this is
      // C:\java.
      File sourceFile = new File(root, file);
      //Files.write(sourceFile.toPath(), source.getBytes(StandardCharsets
      // .UTF_8));

      // Compile source file.
      JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
      int success = compiler.run(null, null, null, sourceFile.getPath());
      if (success != 0) {
        response.setError("Compile Error");
        System.out.println(response.getError());
        return response;
      }
      if (algorithm.equals("sort")) {
        // Load and instantiate compiled class.
        URLClassLoader classLoader =
          URLClassLoader.newInstance(new URL[]{root.toURI().toURL()},
            new SandBoxClassLoader());
        Class<?> cls = Class.forName("test.Test", true, classLoader); // Should
        // print "hello".
        Sort instance = (Sort) cls.getDeclaredConstructor().newInstance(); //
        // Should print "world".
        RecordableArray arr = new RecordableArray(new int[]{9, 5, 8, 1, 2, 4,
          7, 3, 6, 10});
        instance.sort(arr);
        response.setArr(arr);
        System.out.println(response);
        return response;
      } else {
        // Load and instantiate compiled class.
        URLClassLoader classLoader =
          URLClassLoader.newInstance(new URL[]{root.toURI().toURL()},
            new SandBoxClassLoader());
        Class<?> cls = Class.forName("test.SearchTest", true, classLoader); // Should
        // print "hello".
        Search instance =
          (Search) cls.getDeclaredConstructor().newInstance(); //
        // Should print "world".
        RecordableArray arr = new RecordableArray(new int[]{1, 2, 3, 4, 5, 6,
          7, 8, 9, 10});
        int searchVal = (int) (Math.random() * 10) + 1;
        instance.search(arr, searchVal);
        response.setArr(arr);
        response.setSearchVal(searchVal);
        System.out.println(response);
        return response;
      }
    } catch (Throwable e) {
      response.setError("Run time error");
      System.out.println(response.getError());
      return response;
    }
  }
}

/**
 * A class that creates the User Code Response Object
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
class Response {
  private RecordableArray arr;
  private int searchVal;
  private String error;

  /**
   * Default Response constructor
   */
  public Response() {

  }

  /**
   * Response constructor with given parameters
   *
   * @param arr - An existing recordable array
   * @param error - An existing error message
   * @param searchVal - An existing search value
   *
   */
  public Response(RecordableArray arr, String error, int searchVal) {
    this.arr = arr;
    this.error = error;
    this.searchVal = searchVal;
  }

  /**
   * Gets the arr instance variable
   *
   * @return - The recordable array
   */
  public RecordableArray getArr() {
    return arr;
  }

  /**
   * Sets the RecordableArray arr instance variable
   *
   * @param arr - The new recordable array
   */
  public void setArr(RecordableArray arr) {
    this.arr = arr;
  }

  /**
   * Gets the searchVal instance variable
   *
   * @return - The searchVal instance variable
   */
  public int getSearchVal() {
    return searchVal;
  }

  /**
   * Sets the searchVal instance variable
   *
   * @param searchVal - The new searchVal
   */
  public void setSearchVal(int searchVal) {
    this.searchVal = searchVal;
  }

  /**
   * Gets the error instance variable
   *
   * @return - The error instance variable
   */
  public String getError() {
    return error;
  }

  /**
   * Sets the error instance variable
   *
   * @param error - The new error value
   */
  public void setError(String error) {
    this.error = error;
  }
}
