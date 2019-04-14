package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.math.BigDecimal;
import java.math.BigInteger;
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
    public boolean isString() {
        return false;
    }

    @Override
    public Optional<String> getAsString() {
        return Optional.empty();
    }

    @Override
    public boolean isCharacter() {
        return false;
    }

    @Override
    public Optional<Character> getAsCharacter() {
        return Optional.empty();
    }

    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public Optional<Number> getAsNumber() {
        return Optional.empty();
    }

    @Override
    public boolean isBigInteger() {
        return false;
    }

    @Override
    public Optional<BigInteger> getAsBigInteger() {
        return Optional.empty();
    }

    @Override
    public boolean isLong() {
        return false;
    }

    @Override
    public Optional<Long> getAsLong() {
        return Optional.empty();
    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public Optional<Integer> getAsInteger() {
        return Optional.empty();
    }

    @Override
    public boolean isShort() {
        return false;
    }

    @Override
    public Optional<Short> getAsShort() {
        return Optional.empty();
    }

    @Override
    public boolean isByte() {
        return false;
    }

    @Override
    public Optional<Byte> getAsByte() {
        return Optional.empty();
    }

    @Override
    public boolean isBigDecimal() {
        return false;
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal() {
        return Optional.empty();
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public Optional<Double> getAsDouble() {
        return Optional.empty();
    }

    @Override
    public boolean isFloat() {
        return false;
    }

    @Override
    public Optional<Float> getAsFloat() {
        return Optional.empty();
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    @Override
    public Optional<Boolean> getAsBoolean() {
        return Optional.empty();
    }

}
