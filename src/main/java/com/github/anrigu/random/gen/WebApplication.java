package com.github.anrigu.random.gen;

import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.options;
import static spark.Spark.staticFiles;

/**
 * Entrance of the web application that defines the handler of each API request
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
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

    staticFiles.location("/public");

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
    Spark.post("/bubble-sort", "application/json", new PostJsonSortRoute(), new JsonTransformer());
    Spark.post("/insertion-sort", "application/json", new PostJsonSortRoute(), new JsonTransformer());
    Spark.post("/selection-sort", "application/json", new PostJsonSortRoute(), new JsonTransformer());
    Spark.post("/binary-search", "application/json", new PostJsonSearchRoute(), new JsonTransformer());
    Spark.post("/linear-search", "application/json", new PostJsonSearchRoute(), new JsonTransformer());
    Spark.post("/custom-code", "application/json", new CustomCodePostRoute(),new JsonTransformer());
    Spark.get("*", (req,res) -> {
      Map<String, Object> model = new HashMap<>(0);
      return new VelocityTemplateEngine().render(
        new ModelAndView(model, "/public/index.html")
      );
    });
  }
}
