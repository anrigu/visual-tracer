package submitcode;

import com.github.anrigu.random.gen.PostJsonRandomRoute;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
  private static Logger logger = LoggerFactory.getLogger(PostJsonRandomRoute.class);

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
   * @param randArray - An random int array
   *
   * @return the sorted Recordable Array
   */
  public RecordableArray run(Sort sorter, int[] randArray) {
    RecordableArray sorted = new RecordableArray(randArray);
    sorter.sort(sorted);
    return sorted;
  }

  /**
   * Runs a search of a recordable array
   *
   * @param searcher - This is the searcher algorithm used
   * @param searchArr - The search array
   * @param value - The value being searched for
   *
   * @return the searched Recordable Array
   */
  public RecordableArrayWrapper run(Search searcher, int[] searchArr, int value) {
    RecordableArray searched = new RecordableArray(searchArr);
    int val = searcher.search(searched,value);
    RecordableArrayWrapper searchReturn = new RecordableArrayWrapper(searched,val);
    return searchReturn;
  }
}

/**
 * A class that wraps the RecordableArray Class to include a searchVal instance variable
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
class RecordableArrayWrapper {
  private RecordableArray recordableArray;
  private int searchIndex;

  /**
   * A constructor with recordableArray and searchIndex parameters
   *
   * @param recordableArray - The existing recordableArray
   * @param searchIndex - The existing searchIndex
   */
  public RecordableArrayWrapper(RecordableArray recordableArray, int searchIndex) {
    this.recordableArray = recordableArray;
    this.searchIndex = searchIndex;
  }

  /**
   * Creates a string of a RecordableArrayWrapper object.
   *
   * @return a string representation of the RecordableArrayWrapper object
   */
  public String toString() {
    return "RecordableArrayWrapper{" +
      "recordableArray=" + recordableArray +
      ", searchIndex=" + searchIndex +
      '}';
  }
}

