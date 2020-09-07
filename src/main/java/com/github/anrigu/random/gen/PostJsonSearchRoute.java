package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;
import submitcode.Runner;

/**
 * A class that handles the request and response for sort routes
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class PostJsonSearchRoute implements Route {
  private static Logger logger = LoggerFactory.getLogger(PostJsonRandomRoute.class);

  /**
   * Handles the request and response
   *
   * @param request - The request
   * @param response - The response
   *
   * @return An action list and the original random unsorted integer array
   */
  public Object handle(Request request, Response response) throws Exception {
    String body = request.body();
    Gson gson = new Gson();
    logger.debug(body);
    Runner r = new Runner();
    int[] arr;
    SearchRequest search = gson.fromJson(body, SearchRequest.class);
    response.type("application/json");
    if (search.validate()){
      if(search.getSearch().equals("binary")) {
        arr = search.createArr(search.getNumNums());
      }
      else {
        arr = new RandomNumGen().randomNumGenerator(search.getNumNums());
      }
      return r.run(search.createSearch(),arr,search.getSearchVal());
    }
    else {
      return Spark.halt(401);
    }
  }
}
