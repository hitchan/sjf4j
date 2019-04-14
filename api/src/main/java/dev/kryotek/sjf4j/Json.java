package dev.kryotek.sjf4j;

import java.util.Optional;

public interface Json {

    boolean isJsonObject();

    Optional<JsonObject> getAsJsonObject();

    boolean isJsonArray();

    Optional<JsonArray> getAsJsonArray();

    boolean isJsonPrimitive();

    Optional<JsonPrimitive> getAsJsonPrimitive();

}
