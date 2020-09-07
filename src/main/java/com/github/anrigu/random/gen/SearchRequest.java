package com.github.anrigu.random.gen;

import submitcode.BinarySearch;
import submitcode.LinearSearch;
import submitcode.Search;

/**
 * A class that handles the search requests
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class SearchRequest extends RandomNumGenRequest{
  private String search;
  private int searchVal;

  /**
   * Constructor for a request with numString, search, and searchVal parameters
   *
   * @param numString - Number of numbers in the search array requested
   * @param search - The name of the requested search
   * @param searchVal - The value that is requested to be searched for
   *
   */
  public SearchRequest(String numString, String search, int searchVal) {
    super(numString);
    this.search = search;
    this.searchVal = searchVal;
  }

  /**
   * Constructor for a request with no parameters
   *
   */
  public SearchRequest() {
    this("10","",0);
  }

  /**
   * Gets the search value instance variable
   *
   * @return The searchVal instance variable
   *
   */
  public int getSearchVal() {
    return searchVal;
  }

  /**
   * Sets the search value instance variable
   *
   * @param searchVal - The new searchVal instance variable
   *
   */
  public void setSearchVal(int searchVal) {
    this.searchVal = searchVal;
  }

  /**
   * Creates a new int array
   *
   * @param numNums - The number of numbers in the array
   *
   * @return The created int array
   *
   */
  public int[] createArr(int numNums) {
    int[] numArr = new int[numNums];
    for (int i = 1; i <= numNums; i++) { //frontend handles if i < 1
       numArr[i-1] = i;
    }
    return numArr;
  }

  /**
   * Creates the search object from the search name instance variable
   *
   * @return The Search object that corresponds to the name of the search
   *
   */
  public Search createSearch() {
    if (search.equals("binary")) {
      return new BinarySearch();
    }
    else if(search.equals("linear")) {
      return new LinearSearch();
    }
    else {
      return null; //input validation in the frontend
    }
  }

  /**
   * Gets the search instance variable
   *
   * @return The new search instance variable
   *
   */
  public String getSearch() {
    return search;
  }

  /**
   * Sets the search instance variable
   *
   * @param search - The new search instance variable
   *
   */
  public void setSearch(String search) {
    this.search = search;
  }
}
