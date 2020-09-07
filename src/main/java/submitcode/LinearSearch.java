package submitcode;

/**
 * The class implements a linear search algorithm
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class LinearSearch implements Search {

  /**
   * Searches for value in the simple array.
   *
   * @param simpleArray - The simple array that contains the value
   * @param value - The value that needs to be found
   *
   * @return The index of the value within the simple array. Returns -1 if the value isn't in the array
   *
   */
  public int search(SimpleArray simpleArray, int value) {
    for (int i = 0; i < simpleArray.getSize(); i++) {
      if (simpleArray.compareWithValue(i,value) == 0) {
        return i;
      }
    }
    return -1;
  }
}
