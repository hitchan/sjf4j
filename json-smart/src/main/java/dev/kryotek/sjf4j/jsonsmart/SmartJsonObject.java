package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonObject;
import net.minidev.json.JSONObject;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SmartJsonObject implements JsonObject {

    private final JSONObject root;

    public SmartJsonObject(JSONObject root) {
        this.root = root;
    }

    @Override
    public boolean has(String member) {
        return root.containsKey(member);
    }

    @Override
    public Optional<Json> get(String member) {
        Object element = root.get(member);
        return Optional.ofNullable(has(member) ? element == null ? null : new SmartJson(element) : null);
    }

    @Override
    public int size() {
        return root.size();
    }

    @Override
    public Set<Map.Entry<String, Json>> entrySet() {
        return root.entrySet().parallelStream().collect(Collectors.toMap(
                Map.Entry::getKey,
                (Function<Map.Entry<String, Object>, Json>) entry -> new SmartJson(entry.getValue()))).entrySet();
    }

    @Override
    public Set<String> keySet() {
        return root.keySet();
    }
}
