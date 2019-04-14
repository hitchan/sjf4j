package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonObject;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GsonJsonObject implements JsonObject {

    private final com.google.gson.JsonObject root;

    public GsonJsonObject(com.google.gson.JsonObject root) {
        this.root = root;
    }

    @Override
    public boolean has(String member) {
        return root.has(member);
    }

    @Override
    public Optional<Json> get(String member) {
        JsonElement element = root.get(member);
        return Optional.ofNullable(has(member) ? element == null || element.isJsonNull() ? null : new GsonJson(element) : null);
    }

    @Override
    public int size() {
        return root.size();
    }

    @Override
    public Set<Map.Entry<String, Json>> entrySet() {
        return root.entrySet().parallelStream().collect(Collectors.toMap(
                Map.Entry::getKey,
                (Function<Map.Entry<String, JsonElement>, Json>) entry -> new GsonJson(entry.getValue()))).entrySet();
    }

    @Override
    public Set<String> keySet() {
        return root.keySet();
    }
}
