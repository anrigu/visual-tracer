package com.github.anrigu.random.gen;

/**
 * A class that handles the random number generator request
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class RandomNumGenRequest {
  private int numNums;
  private int numLists;
  private String numString;

  /**
   * Constructor for a request with no parameters
   *
   */
  public RandomNumGenRequest() {
    numString = "10";
    numNums = getNumNums();
    numLists = 1;
  }

  /**
   * Constructor for a request with numString parameter
   *
   * @param numString - String representation of the number of numbers generated in the random integer array
   */
  public RandomNumGenRequest(String numString) {
    this.numString = numString;
  }

  public RandomNumGenRequest(String numString, int searchNum) {
    this.numString = numString;
  }

  /**
   * Converts and gets the number of numbers generated in the random integer array
   *
   * @return the number of numbers generated in the random integer array
   */
  public int getNumNums() {
    numNums = Integer.parseInt(numString);
    return numNums;
  }

  /**
   * Validates if the value attempted to be converted from string to int is valid
   *
   * @return true if the value is valid. False if it isn't
   * @throws Exception if numString cannot be parsed to the int data type.
   */
  public boolean validate() {
    try {
      getNumNums();
      return true;
    }
    catch (Exception e) {
      return false;
    }
  }

  /**
   * Sets the numNums value
   *
   * @param numNums - new numNums value
   */
  public void setNumNums(int numNums) {
    this.numNums = numNums;
  }

  /**
   * Gets the numLists value
   *
   * @return the number of random integer array lists requested
   */
  public int getNumLists() {
    return numLists;
  }

  /**
   * Sets the numLists value
   *
   * @param numLists - new numLists value
   */
  public void setNumLists(int numLists) {
    this.numLists = numLists;
  }

  /**
   * Creates a string of the numNums and repeatNums instance variables.
   *
   * @return a string representation of numNums and repeatNums.
   */
  public String toString() {
    return String.format("%s",numNums);
  }
}
