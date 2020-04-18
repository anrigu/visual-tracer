package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;

public class PostJsonRandomRoute implements Route {
  private static Logger logger = LoggerFactory.getLogger(PostJsonRandomRoute.class);

  @Override
  public Object handle(Request request, Response response) throws Exception {
    String body = request.body();
    Gson gson = new Gson();
    RandomNumGenRequest r = gson.fromJson(body, RandomNumGenRequest.class);
    response.type("application/json");
    return new RandomNumGen().randomNumGeneratorNonRepeat(r.getNumNums(), r.isRepeatNums());
  }
}