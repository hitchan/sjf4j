package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;
import dev.kryotek.sjf4j.JsonPrimitive;

import java.util.Optional;

public class GsonJson implements Json {

    private final JsonElement root;

    public GsonJson(JsonElement root) {
        this.root = root;
    }

    @Override
    public boolean isJsonObject() {
        return root.isJsonObject();
    }

    @Override
    public Optional<JsonObject> getAsJsonObject() {
        return Optional.ofNullable(isJsonObject() ? new GsonJsonObject(root.getAsJsonObject()) : null);
    }

    @Override
    public boolean isJsonArray() {
        return root.isJsonArray();
    }

    @Override
    public Optional<JsonArray> getAsJsonArray() {
        return Optional.ofNullable(isJsonArray() ? new GsonJsonArray(root.getAsJsonArray()) : null);
    }

    @Override
    public boolean isJsonPrimitive() {
        return root.isJsonPrimitive();
    }

    @Override
    public Optional<JsonPrimitive> getAsJsonPrimitive() {
        return null;
    }
}
