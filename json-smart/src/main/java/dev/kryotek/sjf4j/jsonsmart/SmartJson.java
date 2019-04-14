package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;
import dev.kryotek.sjf4j.JsonPrimitive;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.Optional;

public class SmartJson implements Json {

    private final Object root;

    public SmartJson(Object root) {
        this.root = root;
    }

    @Override
    public boolean isJsonObject() {
        return root instanceof JSONObject;
    }

    @Override
    public Optional<JsonObject> getAsJsonObject() {
        return Optional.ofNullable(isJsonObject() ? new SmartJsonObject((JSONObject) root) : null);
    }

    @Override
    public boolean isJsonArray() {
        return root instanceof JSONArray;
    }

    @Override
    public Optional<JsonArray> getAsJsonArray() {
        return Optional.ofNullable(isJsonArray() ? new SmartJsonArray((JSONArray) root) : null);
    }

    @Override
    public boolean isJsonPrimitive() {
        return false;
    }

    @Override
    public Optional<JsonPrimitive> getAsJsonPrimitive() {
        return null;
    }
}
