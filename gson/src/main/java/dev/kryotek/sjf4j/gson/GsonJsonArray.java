package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;

import java.util.Optional;

public class GsonJsonArray implements JsonArray {

    private final com.google.gson.JsonArray root;

    public GsonJsonArray(com.google.gson.JsonArray root) {
        this.root = root;
    }

    @Override
    public boolean has(int index) {
        JsonElement element = root.get(index);
        return element != null && !element.isJsonNull();
    }

    @Override
    public Optional<Json> get(int index) {
        return Optional.ofNullable(has(index) ? new GsonJson(root.get(index)) : null);
    }

    @Override
    public int size() {
        return root.size();
    }
}
