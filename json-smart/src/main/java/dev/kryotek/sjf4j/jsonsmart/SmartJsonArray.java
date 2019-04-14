package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import net.minidev.json.JSONArray;

import java.util.Optional;

public class SmartJsonArray implements JsonArray {

    private final JSONArray root;

    public SmartJsonArray(JSONArray root) {
        this.root = root;
    }

    @Override
    public boolean has(int index) {
        Object element = root.get(index);
        return element != null;
    }

    @Override
    public Optional<Json> get(int index) {
        return Optional.ofNullable(has(index) ? new SmartJson(root.get(index)) : null);
    }

    @Override
    public int size() {
        return root.size();
    }
}
