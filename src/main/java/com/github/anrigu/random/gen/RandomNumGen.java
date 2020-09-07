package com.github.anrigu.random.gen;

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
   * @return the random integer array
   */
  public int[] randomNumGenerator(int numNums) {
    int[] numArray = new int[numNums];
    Random randomNum = new Random();
    for (int i = 0; i < numNums; i++) {
      numArray[i] = i+1;
    }
    for (int j = 0; j < numNums; j++) {
      int index1 = randomNum.nextInt(numNums);
      int index2 = randomNum.nextInt(numNums);
      int temp = numArray[index1];
      numArray[index1] = numArray[index2];
      numArray[index2] = temp;
    }
    logger.debug("Generated num: " + toString(numArray));
    return numArray;
  }

  /**
   * Generates multiple random integer arrays.
   *
   * @param listLength - Length of each of the arrays
   * @param numLists - Number of arrays generated
   * @return the 2d array with all the random integer arrays
   */
  public int[][] generateMultipleRandLists(int listLength, int numLists) {
    int[][] randLists = new int[numLists][listLength];
    for (int i = 0; i < numLists; i++) {
      randLists[i] = randomNumGenerator(listLength);
    }
    return randLists;
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