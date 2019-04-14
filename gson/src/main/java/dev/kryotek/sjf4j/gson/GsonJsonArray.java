package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;

import java.math.BigDecimal;
import java.math.BigInteger;
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
    public Optional<JsonObject> getAsJsonObject(int index) {
        return get(index).map(json -> json.getAsJsonObject().orElse(null));
    }

    @Override
    public Optional<JsonArray> getAsJsonArray(int index) {
        return get(index).map(json -> json.getAsJsonArray().orElse(null));
    }

    @Override
    public Optional<String> getAsString(int index) {
        return get(index).map(json -> json.getAsString().orElse(null));
    }

    @Override
    public Optional<Character> getAsCharacter(int index) {
        return get(index).map(json -> json.getAsCharacter().orElse(null));
    }

    @Override
    public Optional<Number> getAsNumber(int index) {
        return get(index).map(json -> json.getAsNumber().orElse(null));
    }

    @Override
    public Optional<BigInteger> getAsBigInteger(int index) {
        return get(index).map(json -> json.getAsBigInteger().orElse(null));
    }

    @Override
    public Optional<Long> getAsLong(int index) {
        return get(index).map(json -> json.getAsLong().orElse(null));
    }

    @Override
    public Optional<Integer> getAsInteger(int index) {
        return get(index).map(json -> json.getAsInteger().orElse(null));
    }

    @Override
    public Optional<Short> getAsShort(int index) {
        return get(index).map(json -> json.getAsShort().orElse(null));
    }

    @Override
    public Optional<Byte> getAsByte(int index) {
        return get(index).map(json -> json.getAsByte().orElse(null));
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal(int index) {
        return get(index).map(json -> json.getAsBigDecimal().orElse(null));
    }

    @Override
    public Optional<Double> getAsDouble(int index) {
        return get(index).map(json -> json.getAsDouble().orElse(null));
    }

    @Override
    public Optional<Float> getAsFloat(int index) {
        return get(index).map(json -> json.getAsFloat().orElse(null));
    }

    @Override
    public Optional<Boolean> getAsBoolean(int index) {
        return get(index).map(json -> json.getAsBoolean().orElse(null));
    }

    @Override
    public int size() {
        return root.size();
    }
}
