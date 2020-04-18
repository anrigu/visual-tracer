package SelfWrittenArray;

import java.util.Arrays;

/**
 * An Object holding an array and methods that can compare, and check the length of the array
 *
 * @author Anri Gu
 * @version 1.0
 * @since JDK 1.0
 */


public class SimpleArray {
  private int size;
  private int[] intArray;

  /**
   * Constructor for new modified array's with an existing integer array
   *
   * @param intArray - Initial array of integers
   */
  public SimpleArray(int[] intArray) {
    this.size = intArray.length;
    this.intArray = intArray;
  }

  /**
   * Constructor for new modified array's with no existing array
   */
  public SimpleArray() {
    this(new int[0]);

  }

  public int getSize() {
    return this.size;
  }

  public int compare(int index1, int index2) {
    try {
      if (intArray[index1] > intArray[index2]) {
        return 1; //1 = index 1 > index 2
      } else if (intArray[index1] == intArray[index2]) {
        return 0; //0 = index1 = index2
      } else {
        return -1; //-1 = index 2 > index 1
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException("Index is not in range of the array");
    }
  }

  public int compareWithValue(int index, int value) {
    try {
      if (intArray[index] > value) {
        return 1; //1 = num at index > value
      } else if (intArray[index] == value) {
        return 0; //0 = num at index = value
      } else {
        return -1; //-1 = value > num at index;
      }
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException("Index given is not in range of the array.");
    }
  }

  public void swapValues(int index1, int index2) {
    try {
      int temp = intArray[index2];
      intArray[index2] = intArray[index1];
      intArray[index1] = temp;
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException(("Index given is not in range of the array"));
    }
  }

  public String toString() {
    return Arrays.toString(intArray);
  }

}
