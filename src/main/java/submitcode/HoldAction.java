package submitcode;

/**
 * A class that holds an action
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class HoldAction {
  private String action;
  private int[] index;
  private Integer value;

  /**
   * Constructor for an action between an external value and a number in an array
   *
   * @param action - The action name
   * @param index - List of the indexes of the array that are being acted on
   * @param value - An external value that numbers in the array may be compared to.
   *
   */
  HoldAction(String action, int[] index, Integer value) {
    this.action = action;
    this.index = index;
    this.value = value;
  }

  /**
   * Constructor for an action between 2 specific indexes
   *
   * @param action - The action name
   * @param index1 - The first index of the array that is being acted on
   * @param index2 - The second index of the array that is being acted on
   *
   */
  HoldAction(String action, int index1, int index2) {
    this(action,new int[]{index1,index2},null);
  }

  /**
   * Creates a string of an action.
   *
   * @return a string representation of the action and the indexes in question
   */
  public String toString() {
    return String.format("%s: %s and %s", action, index[0], index[1]);
  }

  public static String ACTION_COMPARE_INDEX= "Compare";
  public static String ACTION_SWAP_INDEX= "Swap";
}
