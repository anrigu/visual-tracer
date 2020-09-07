package submitcode;

/**
 * An interface of a searching algorithm
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public interface Search {

  /**
   * Searches the given simple array
   *
   * @param simpleArray - An sorted simple array
   * @param value - The value being searched for
   *
   * @return The index of the value in the simple array. -1 is returned if the value isn't in the array
   */
  int search(SimpleArray simpleArray, int value);
}
