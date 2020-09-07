package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import spark.Spark;
import submitcode.Runner;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;
import java.io.File;  // Import the File class
import java.io.IOException;
import java.io.FileWriter;
import java.util.Map;

/**
 * A class that handles the request and response for the user code route
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class  CustomCodePostRoute implements Route{
  public static String filePath = "/temp/data";
  public static String file = "/test/Test.java";
  private static String template = "package test;\n" +
    "\n" +
    "import submitcode.SimpleArray;\n" +
    "import submitcode.Sort;\n" +
    "\n" +
    "\n" +
    "public class Test implements Sort {\n" +
    "  public void sort(SimpleArray arr) {\n%s" +
    "  }\n" +
    "}";

  /**
   * Sets the instance variable file to the passed in file
   *
   * @param file - The new file path
   *
   */
  public static void setFile(String file) {
    CustomCodePostRoute.file = file;
  }

  /**
   * Sets the instance variable template to the passed in template
   *
   * @param template - The new template
   *
   */
  public static void setTemplate(String template) {
    CustomCodePostRoute.template = template;
  }

  /**
   * Handles the request and response
   *
   * @param request - The request
   * @param response - The response
   *
   * @return A simple array, and the search value (if applicable)
   * @throws IOException - If an error in compiling the code occurs
   */
  public Object handle(Request request, Response response) throws Exception {
    String body = request.body();
    Gson gson = new Gson();
    Map<String,String> map = gson.fromJson(body, Map.class);
    String userCode = map.get("userCode");
    try {
      if (map.get("algorithm").equals("search")) {
        setFile("/test/SearchTest.java");
        setTemplate("package test;\n" +
          "\n" +
          "import submitcode.SimpleArray;\n" +
          "import submitcode.Search;\n" +
          "\n" +
          "public class SearchTest implements Search {\n" +
          "  public int search(SimpleArray arr, int searchVal) {\n" +
          "    %s\n" +
          "  }\n" +
          "}\n");
      }
      else {
        setFile("/test/Test.java");
        setTemplate("package test;\n" +
          "\n" +
          "import submitcode.SimpleArray;\n" +
          "import submitcode.Sort;\n" +
          "\n" +
          "\n" +
          "public class Test implements Sort {\n" +
          "  public void sort(SimpleArray arr) {\n%s" +
          "  }\n" +
          "}");

      }
      FileWriter myWriter = new FileWriter(filePath + file);
      myWriter.write(String.format(template,userCode));
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    CustomSorting r = new CustomSorting();
    response.type("application/json");
    return r.run(filePath, file,map.get("algorithm"));
  }
}
