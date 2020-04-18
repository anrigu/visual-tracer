package com.github.anrigu.random.gen;

import spark.Spark;

import static spark.Spark.options;

public class WebApplication {
  private static final int DefaultPort = 8080;

  public static void main(String[] args) {
    int port = DefaultPort;
    if (args.length > 0) {
      try {
        port = Integer.parseInt(args[0]);
      } catch (Exception e) {
        System.err.println(String.format("Invalid port:  " + args[0]));
      }
    }

    System.out.println(String.format("Web application will start at port : %s", port));

    // Listen to the port
    Spark.port(port);
    options("/*", (request, response) -> {

      String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
      if (accessControlRequestHeaders != null) {
        response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
      }

      String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
      if (accessControlRequestMethod != null) {
        response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
      }

      return "OK";
    });
    Spark.before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));

    Spark.post("/random", "application/json", new PostJsonRandomRoute(), new JsonTransformer());
    Spark.post("/bubble-sort", "application/json", new PostJsonBubbleRoute(), new JsonTransformer());
  }
}
