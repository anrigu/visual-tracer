package com.github.anrigu.random.gen;

public class RandomNumGenRequest {
  private int num;
  private int numLists;
  private boolean repeatNums;

  public RandomNumGenRequest() {
    num = 10;
    numLists = 1;
    repeatNums = false;
  }

  public RandomNumGenRequest(int num, int numLists, boolean repeatNums) {
    num = this.num;
    numLists = this.num;
    repeatNums = this.repeatNums;
  }

  public boolean isRepeatNums() {
    return repeatNums;
  }

  public void setRepeatNums(boolean repeatNums) {
    this.repeatNums = repeatNums;
  }

  public int getNumLists() {
    return numLists;
  }

  public void setNumLists(int numLists) {
    this.numLists = numLists;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String toString() {
    return String.format("%s, %s, %s",num, numLists, repeatNums);
  }
}
