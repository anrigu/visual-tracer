package SelfWrittenArray;

import sun.jvm.hotspot.debugger.win32.coff.MachineTypes;

public class HoldAction {
  private String action;
  private int[] index;
  private Integer value;

  HoldAction(String action, int[] index, Integer value) {
    this.action = action;
    this.index = index;
    this.value = value;
  }

  HoldAction(String action, int index1, int index2) {
    this(action,new int[]{index1,index2},null);
  }
  public String toString() {
    return String.format("%s: %s and %s", action, index[0], index[1]);
  }

  public static String ACTION_COMPARE_INDEX= "Compare";
  public static String ACTION_SWAP_INDEX= "Swap";





}
