package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;
import submitcode.BubbleSort;
import submitcode.Runner;

public class PostJsonBubbleRoute implements Route {
  private static Logger logger = LoggerFactory.getLogger(PostJsonRandomRoute.class);

  @Override
  public Object handle(Request request, Response response) throws Exception {
    String body = request.body();
    Gson gson = new Gson();
    logger.debug(body);
    Runner r = new Runner();
    RandomNumGenRequest random = gson.fromJson(body, RandomNumGenRequest.class);
    response.type("application/json");
    return r.run(new BubbleSort(),new RandomNumGen().randomNumGeneratorNonRepeat(random.getNumNums(),random.isRepeatNums()));
  }
}