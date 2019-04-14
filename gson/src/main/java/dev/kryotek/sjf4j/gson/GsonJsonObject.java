package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
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
        return Optional.ofNullable(has(member) ? new GsonJson(root.get(member)) : null);
    }

    @Override
    public Optional<JsonObject> getAsJsonObject(String member) {
        return get(member).map(json -> json.getAsJsonObject().orElse(null));
    }

    @Override
    public Optional<JsonArray> getAsJsonArray(String member) {
        return get(member).map(json -> json.getAsJsonArray().orElse(null));
    }

    @Override
    public Optional<String> getAsString(String member) {
        return get(member).map(json -> json.getAsString().orElse(null));
    }

    @Override
    public Optional<Character> getAsCharacter(String member) {
        return get(member).map(json -> json.getAsCharacter().orElse(null));
    }

    @Override
    public Optional<Number> getAsNumber(String member) {
        return get(member).map(json -> json.getAsNumber().orElse(null));
    }

    @Override
    public Optional<BigInteger> getAsBigInteger(String member) {
        return get(member).map(json -> json.getAsBigInteger().orElse(null));
    }

    @Override
    public Optional<Long> getAsLong(String member) {
        return get(member).map(json -> json.getAsLong().orElse(null));
    }

    @Override
    public Optional<Integer> getAsInteger(String member) {
        return get(member).map(json -> json.getAsInteger().orElse(null));
    }

    @Override
    public Optional<Short> getAsShort(String member) {
        return get(member).map(json -> json.getAsShort().orElse(null));
    }

    @Override
    public Optional<Byte> getAsByte(String member) {
        return get(member).map(json -> json.getAsByte().orElse(null));
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal(String member) {
        return get(member).map(json -> json.getAsBigDecimal().orElse(null));
    }

    @Override
    public Optional<Double> getAsDouble(String member) {
        return get(member).map(json -> json.getAsDouble().orElse(null));
    }

    @Override
    public Optional<Float> getAsFloat(String member) {
        return get(member).map(json -> json.getAsFloat().orElse(null));
    }

    @Override
    public Optional<Boolean> getAsBoolean(String member) {
        return get(member).map(json -> json.getAsBoolean().orElse(null));
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
