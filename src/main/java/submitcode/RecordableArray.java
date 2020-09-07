package submitcode;

import java.util.ArrayList;

/**
 * A class that creates an array of actions
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class RecordableArray extends SimpleArray {
  private ArrayList<HoldAction> actionList;
  private int[] randArray;

  /**
   * Constructor for new recordable arrays with no existing values
   *
   */
  public RecordableArray() {
    this(new int[0]);

  }

  /**
   * Constructor for new recordable arrays with existing values
   *
   * @params intArray - An existing integer array
   */
  public RecordableArray(int[] intArray) {
    super(intArray);
    this.randArray = intArray.clone();
    this.actionList = new ArrayList<>();
  }

  /**
   * Records and completes a compare action between index1 and index2.
   *
   * @param index1 - This is the first index
   * @param index2 - This is the second index
   *
   * @return an integer indicating which index held the larger number. 1 if the number at index1 is greater than the number at index2,
   * 0 if the numbers are the same, and -1 if the number at index2 is greater.
   */
  @Override
  public int compare(int index1, int index2) {
    addAction(HoldAction.ACTION_COMPARE_INDEX,index1, index2);
    return super.compare(index1, index2);
  }

  public int compareWithValue(int index, int value) {
    addAction(HoldAction.ACTION_COMPARE_VALUE,index,value);
    return super.compareWithValue(index,value);
  }

  /**
   * Records and completes a swap action at the 2 indexes.
   *
   * @param index1 - This is the first index
   * @param index2 - This is the second index
   *
   */
  public void swapValues(int index1, int index2) {
    addAction(HoldAction.ACTION_SWAP_INDEX,index1, index2);
    super.swapValues(index1, index2);
  }

  /**
   * Adds the action to the action list.
   *
   * @param action - Name of the action
   * @param index1 - The irst index
   * @param index2 - The second index
   *
   */
  public void addAction(String action, int index1, int index2) {
    int[] values = {index1, index2};
    actionList.add(new HoldAction(action,index1,index2));
  }

  /**
   * Gets the action list.
   *
   * @return The action list
   */
  public ArrayList<HoldAction> getCompareMovesList() {
    return actionList;
  }

  /**
   * Creates a string with the sorted array and the action list.
   *
   * @return A string representation of the object with the sorted array and the action list
   */
  public String toString() {
    return ( actionList.toString() + super.toString() );
  }
}
