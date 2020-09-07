package com.github.anrigu.random.gen;

import submitcode.*;

/**
 * A class that handles the sort request
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class SortRequest extends RandomNumGenRequest {
  private String sort;

  /**
   * Constructor for a request with no parameters
   *
   */
  public SortRequest() {
    super();
    this.sort = "";
  }

  /**
   * Constructor for a request with a sort parameter
   *
   * @param sort - name of the sort requested
   *
   */
  public SortRequest(String sort) {
    super();
    this.sort = sort;
  }

  /**
   * Matches the sort name to the matching Sort object
   *
   * @return The requested Sort object
   */
  public Sort createSort() {
    if (sort.equals("bubble")) {
      return new BubbleSort();
    }
    else if(sort.equals("insertion")) {
      return new InsertionSort();
    }
    else if(sort.equals("selection")) {
      return new SelectionSort();
    }
    return null;
  }

  /**
   * Gets the sort value
   *
   * @return the sort value
   */
  public String getSort() {
    return sort;
  }

  /**
   * Sets the sort value
   *
   * @param sort - new sort value
   */
  public void setSort(String sort) {
    this.sort = sort;
  }
}
