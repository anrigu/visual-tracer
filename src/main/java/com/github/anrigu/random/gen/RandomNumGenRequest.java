package com.github.anrigu.random.gen;

public class RandomNumGenRequest {
  private int numNums;
  private int numLists;
  private boolean repeatNums;

  public RandomNumGenRequest() {
    numNums = 10;
    repeatNums = false;
  }

  public RandomNumGenRequest(int numNums, boolean repeatNums) {
    numNums = this.numNums;
    repeatNums = this.repeatNums;
  }

  public boolean isRepeatNums() {
    return repeatNums;
  }

  public void setRepeatNums(boolean repeatNums) {
    this.repeatNums = repeatNums;
  }

  public int getNumNums() {
    return numNums;
  }

  public void setNumNums(int numNums) {
    this.numNums = numNums;
  }

  public String toString() {
    return String.format("%s, %s, %s",numNums, repeatNums);
  }
}
