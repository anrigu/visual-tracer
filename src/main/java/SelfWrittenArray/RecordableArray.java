package SelfWrittenArray;

import java.util.ArrayList;

public class RecordableArray extends SimpleArray {
  private ArrayList<HoldAction> actionList;

  public RecordableArray() {
    this(new int[0]);
  }

  public RecordableArray(int[] intArray) {
    super(intArray);
    this.actionList = new ArrayList<>();
  }

  @Override
  public int compare(int index1, int index2) {
    addAction(HoldAction.ACTION_COMPARE_INDEX,index1, index2);
    return super.compare(index1, index2);
  }

  public void swapValues(int index1, int index2) {
    addAction(HoldAction.ACTION_SWAP_INDEX,index1, index2);
    super.swapValues(index1, index2);
  }

  public void addAction(String action, int index1, int index2) {
    int[] values = {index1, index2};
    actionList.add(new HoldAction(action,index1,index2));
  }

  public ArrayList<HoldAction> getCompareMovesList() {
    return actionList;
  }

  public String toString() {
    return (actionList.toString());
  }
}
