package submitcode;

import com.github.anrigu.random.gen.RandomNumGen;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * An class that creates a data file for testing
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class FileGenerator {
  static int NUM_NUMS = 1000;

  /**
   * Generates a file and writes random integers in.
   *
   * @param array - an array of integers
   * @param fileName - Name of the file
   * @param buffer - Used to increase the size of the numbers so that the file requirement size is met
   *
   */
  public void saveFile(int[] array, String fileName, int buffer) {
    Path path = FileSystems.getDefault().getPath(".", fileName);
    try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND , StandardOpenOption.CREATE)) {
        for (int i = 0; i < array.length; i++) {
          writer.write(Integer.toString(array[i] + buffer));
          writer.write(" ");
        }
        writer.write("\n");
    } catch (IOException x) {
      System.err.format("IOException: %s%n", x);
    }
  }

  /**
   * Reads integers from a file.
   *
   * @param fileName - Name of the file
   *
   * @return An array with random integers.
   */
  public int[] readFile(String fileName) {
    Path path = FileSystems.getDefault().getPath(".", fileName);
    int[] randArray = new int[NUM_NUMS];
    try (BufferedReader reader = Files.newBufferedReader(path)) {
      String line = null;
      line = reader.readLine();
        String[] splitLine = line.split(" ");
        for (int i = 0; i < randArray.length; i++) {
          randArray[i] = Integer.parseInt(splitLine[i]);
        }
    } catch (IOException x) {
      System.err.format("IOException: %s%n", x);
    }
    return randArray;
  }

  public static void main(String[] args) {
    FileGenerator x = new FileGenerator();
    for (int i = 0; i < NUM_NUMS; i++) {
      x.saveFile(new RandomNumGen().randomNumGenerator(NUM_NUMS),"dataFile.txt",10000);
    }
    Runner y = new Runner();
    for (int i = 0; i < NUM_NUMS; i++) {
      int[] randArray = x.readFile("dataFile.txt");
      y.run(new SelectionSort(), randArray);
      x.saveFile(randArray,"dataResults.txt",0);
    }
  }

}
