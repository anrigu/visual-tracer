package com.github.anrigu.random.gen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class RandomNumGen {
  private static Logger logger = LoggerFactory.getLogger(RandomNumGen.class);

  public int[] randomNumGeneratorNonRepeat(int numNums, boolean repeatNums) {
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

  public int[][] generateMultipleRandLists(int listLength, int numLists, boolean repeatNums) {
    int[][] randLists = new int[numLists][listLength];
    for (int i = 0; i < numLists; i++) {
      randLists[i] = randomNumGeneratorNonRepeat(listLength, repeatNums);
    }
    return randLists;
  }

  public boolean repeat(int[] numArray, int random) {
    for (int i = 0; i < numArray.length; i++) {
      if (numArray[i] == random) {
        return true;
      }
    }
    return false;
  }

  public String toString(int[] numArray) {
    StringBuffer buffer = new StringBuffer();
    for (int number : numArray) {
      buffer.append(number);
      buffer.append(", ");
    }
    return buffer.toString();
  }
}