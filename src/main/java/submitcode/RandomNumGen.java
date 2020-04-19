package submitcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * An class that implements a random number generator
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class RandomNumGen {
  private static Logger logger = LoggerFactory.getLogger(RandomNumGen.class);

  /**
   * Creates a random integer array.
   *
   * @param numNums - The length of the array
   * @param repeatNums - Indicates whether or not the array will include repeating numbers. True if numbers can repeat,
   * false if numbers cannot repeat
   *
   * @return the random integer array
   */
  public int[] randomNumGenerator(int numNums, boolean repeatNums) {
    int[] numArray = new int[numNums];
    Random randomNum = new Random();
    for (int i = 0; i < numNums; i++) {
      int randomInt = randomNum.nextInt(numNums + 1);
      if (!repeatNums) {
        boolean randomInArray = true;
        while (randomInArray) {
          if (repeat(numArray, randomInt)) {
            randomInt = randomNum.nextInt(numNums + 1);
          } else {
            randomInArray = false;
          }
        }
      }
      numArray[i] = randomInt;
    }
    logger.debug("Generated num: " + toString(numArray));
    return numArray;
  }

  /**
   * Generates multiple random integer arrays.
   *
   * @param listLength - Length of each of the arrays
   * @param numLists - Number of arrays generated
   * @param repeatNums - Indicator of whether or not the array will include repeating numbers. True if numbers can repeat,
   * false if numbers cannot repeat
   *
   * @return the 2d array with all the random integer arrays
   */
  public int[][] generateMultipleRandLists(int listLength, int numLists, boolean repeatNums) {
    int[][] randLists = new int[numLists][listLength];
    for (int i = 0; i < numLists; i++) {
      randLists[i] = randomNumGenerator(listLength, repeatNums);
    }
    return randLists;
  }

  /**
   * Determines if a number has already been generated.
   *
   * @param numArray - The array of integers
   * @param random - The number that is checked for repeats
   *
   * @return boolean indicating whether or not the number is already in the array. True if it is already in the array,
   * false if it isn't in the array
   */
  private boolean repeat(int[] numArray, int random) {
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == random) {
        return true;
      }
    }
    return false;
  }

  /**
   * Creates a string of a random integer array.
   *
   * @param numArray - An array of integers
   *
   * @return A string representation of the random integer array
   */
  public String toString(int[] numArray) {
    StringBuffer buffer = new StringBuffer();
    for (int number : numArray) {
      buffer.append(number);
      buffer.append(", ");
    }
    return buffer.toString();
  }
}