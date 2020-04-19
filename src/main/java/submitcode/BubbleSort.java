package submitcode;

/**
 * The class implements a bubble sort algorithm
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class BubbleSort implements Sort{

  /**
   * Sorts a Simple Array in ascending numerical order.
   *
   * @param modArray - The simple array that is being sorted
   *
   */
  public void sort(SimpleArray modArray) {

    for (int i = 0; i < modArray.getSize(); i++) {
      for (int j = i+1; j < modArray.getSize(); j++) {
        if (modArray.compare(i, j) == 1) {
          modArray.swapValues(i,j);
        }
      }
    }
  }
}
