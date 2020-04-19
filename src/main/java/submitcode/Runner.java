package submitcode;

/**
 * A class that implements sorting algorithms
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class Runner {
  private final static int DEFAULT_NUM_NUMS = 10;
  private int[] randArray;

  public int[] getRandArray() {
    return randArray;
  }

  public void setRandArray(int[] randArray) {
    this.randArray = randArray;
  }

  /**
   * Constructor for new runner objects
   *
   */
  public Runner(int[] randArray) {
    this.randArray = randArray;
  }

  public Runner() {
    randArray = new int[DEFAULT_NUM_NUMS];
  }

  /**
   * Runs a sort of a recordable array
   *
   * @param sorter - This is the sorting algorithm used
   *
   * @return the sorted Recordable Array
   */
  public RecordableArray run(Sort sorter, int[] randArray) {
    RecordableArray sorted = new RecordableArray(randArray);
    sorter.sort(sorted);
    return sorted;
  }

//  /**
//   * Runs a sort of a recordable array with no specified numNums
//   *
//   * @param sorter - The sorting algorithm used
//   *
//   * @return the sorted Recordable Array
//   */
//  public RecordableArray run(Sort sorter) {
//    return run(sorter,DEFAULT_NUM_NUMS);
//  }

}
