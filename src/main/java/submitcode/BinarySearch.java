package submitcode;

/**
 * The class implements a binary search algorithm
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class BinarySearch implements Search {

  /**
   * Searches for value in the simple array.
   *
   * @param simpleArray - The simple array that contains the value
   * @param value       - The value that needs to be found
   * @param start       - The start index of the simple array
   * @param end         - The end index of the simple array
   *
   * @return The index of the value within the simple array. Returns -1 if the value isn't in the array
   */
  private int search(SimpleArray simpleArray, int value, int start, int end) {
    //assume simpleArray is already sorted
      if (end < start) {
        return -1;
      }
      int middleInd = start + (end - start) / 2;
      int isVal = simpleArray.compareWithValue(middleInd, value);
      if (isVal == 0) {
        return middleInd;
      } else if (isVal == 1) { //val > index
        return search(simpleArray, value, middleInd + 1, end);
      } else {
        return search(simpleArray, value, start, middleInd - 1);
      }

  }

  /**
   * Searches for value in the simple array.
   *
   * @param simpleArray - The simple array that contains the value
   * @param value - The value that needs to be found
   *
   * @return The index of the value within the simple array. Returns -1 if the value isn't in the array
   */
  public int search(SimpleArray simpleArray, int value) {
    return search(simpleArray, value, 0, simpleArray.getSize() - 1);
  }
}
