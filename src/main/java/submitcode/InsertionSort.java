package submitcode;

/**
 * The class implements an insertion sort algorithm
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class InsertionSort implements Sort {

  /**
   * Sorts a Simple Array in ascending numerical order.
   *
   * @param modArray - The simple array that is being sorted
   *
   */
  public void sort(SimpleArray modArray) {
    for (int i = 0; i < modArray.getSize()-1; i ++) {
      int temp = i+1;
      if (modArray.compare(i,temp) == 1) {
        modArray.swapValues(i,temp);
        for (int j = i-1; j >= 0 ; j--) {
          temp = j + 1;
          if (modArray.compare(j,temp) == 1) {
            modArray.swapValues(j,temp);
          }
        }
      }
    }
  }
}
