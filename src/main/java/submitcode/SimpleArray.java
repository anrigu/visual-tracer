
package submitcode;

import java.util.Arrays;

/**
 * A class that implements an array that supports in-place sorting
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class SimpleArray {
  private int size;
  private int[] intArray;

  /**
   * Constructor for a new simple array with an existing integer array
   *
   * @param intArray - Initial array of integers
   */
  public SimpleArray(int[] intArray) {
    this.size = intArray.length;
    this.intArray = intArray;
  }

  /**
   * Constructor for a new simple array with no existing array
   */
  public SimpleArray() {
    this(new int[0]);

  }

  /**
   * Gets the size of the integer array
   *
   * @return The size of the array
   */
  public int getSize() {
    return this.size;
  }

  /**
   * Compares two numbers in the integer array
   *
   * @param index1 - The first index
   * @param index2 - The second index
   *
   * @return a number signifying which number was greater. 1 if the number at index1 is greater than the number at index2,
   * 0 if the numbers are the same, and -1 if the number at index2 is greater.
   * @throws IndexOutOfBoundsException - if one of the indexes given is not in the bounds of the array.
   */
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

  /**
   * Compares a number in the integer array with an integer value
   *
   * @param index - The index of the number in the array
   * @param value - The external integer value
   *
   * @return a number signifying which number was greater. 1 if the number at index1 is greater than the number at index2,
   * 0 if the numbers are the same, and -1 if the number at index2 is greater.
   * @throws IndexOutOfBoundsException - if the index given is not in the bounds of the array.
   */
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

  /**
   * Swaps values at 2 index values
   *
   * @param index1 - The first index
   * @param index2 - The second index
   *
   * @throws IndexOutOfBoundsException -  if one of the indexes given is not in the bounds of the array.
   */
  public void swapValues(int index1, int index2) {
    try {
      int temp = intArray[index2];
      intArray[index2] = intArray[index1];
      intArray[index1] = temp;
    } catch (IndexOutOfBoundsException e) {
      throw new IndexOutOfBoundsException(("Index given is not in range of the array"));
    }
  }

  /**
   * Creates a string with the sorted array.
   *
   * @return a string representation of the sorted integer array
   */
  public String toString() {
    return Arrays.toString(intArray);
  }

}
