package com.github.anrigu.random.gen;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Transforms GSON to JSON Object
 *
 * @author Anri Gu
 * @version 1.0
 * @since 1.0
 *
 */
public class JsonTransformer implements ResponseTransformer {

  private Gson gson = new Gson();

  /**
   * Returns string of the JSON Object.
   *
   * @return the converted JSON Object from the GSON Object
   */
  public String render(Object model) {
    return gson.toJson(model);
  }

}