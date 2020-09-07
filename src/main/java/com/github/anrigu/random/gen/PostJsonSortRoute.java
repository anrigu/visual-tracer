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
public class PostJsonSortRoute implements Route {
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
    SortRequest sort = gson.fromJson(body, SortRequest.class);
    response.type("application/json");
    if (sort.validate()){
      logger.debug("hello",sort.getSort());
      return r.run(sort.createSort(),new RandomNumGen().randomNumGenerator(sort.getNumNums()));
    }
    else {
      return Spark.halt(401);
    }
  }
}