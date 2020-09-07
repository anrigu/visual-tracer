package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 * A class that handles the request and response for the random number generator route
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 */
public class PostJsonRandomRoute implements Route {
  private static Logger logger = LoggerFactory.getLogger(PostJsonRandomRoute.class);


  /**
   * Handles the request and response
   *
   * @param request - The request
   * @param response - The response
   *
   * @return A 2d array with random integer arrays
   */
  public Object handle(Request request, Response response) throws Exception {
    String body = request.body();
    Gson gson = new Gson();
    RandomNumGenRequest r = gson.fromJson(body, RandomNumGenRequest.class);
    response.type("application/json");
    return new RandomNumGen().generateMultipleRandLists(r.getNumNums(),r.getNumLists());
  }
}