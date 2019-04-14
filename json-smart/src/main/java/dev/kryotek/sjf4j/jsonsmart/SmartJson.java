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
        return root instanceof String;
    }

    @Override
    public Optional<String> getAsString() {
        return Optional.ofNullable(isString() ? ((String) root) : null);
    }

    @Override
    public boolean isCharacter() {
        return root instanceof Character;
    }

    @Override
    public Optional<Character> getAsCharacter() {
        return Optional.ofNullable(isCharacter() ? ((Character) root) : null);
    }

    @Override
    public boolean isNumber() {
        return root instanceof Number;
    }

    @Override
    public Optional<Number> getAsNumber() {
        return Optional.ofNullable(isNumber() ? ((Number) root) : null);
    }

    @Override
    public boolean isBigInteger() {
        return root instanceof BigInteger;
    }

    @Override
    public Optional<BigInteger> getAsBigInteger() {
        return Optional.ofNullable(isBigInteger() ? ((BigInteger) root) : null);
    }

    @Override
    public boolean isLong() {
        return root instanceof Long;
    }

    @Override
    public Optional<Long> getAsLong() {
        return Optional.ofNullable(isLong() ? ((Long) root) : null);
    }

    @Override
    public boolean isInteger() {
        return root instanceof Integer;
    }

    @Override
    public Optional<Integer> getAsInteger() {
        return Optional.ofNullable(isInteger() ? ((Integer) root) : null);
    }

    @Override
    public boolean isShort() {
        return root instanceof Short;
    }

    @Override
    public Optional<Short> getAsShort() {
        return Optional.ofNullable(isShort() ? ((Short) root) : null);
    }

    @Override
    public boolean isByte() {
        return root instanceof Byte;
    }

    @Override
    public Optional<Byte> getAsByte() {
        return Optional.ofNullable(isByte() ? ((Byte) root) : null);
    }

    @Override
    public boolean isBigDecimal() {
        return root instanceof BigDecimal;
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal() {
        return Optional.ofNullable(isBigDecimal() ? ((BigDecimal) root) : null);
    }

    @Override
    public boolean isDouble() {
        return root instanceof Double;
    }

    @Override
    public Optional<Double> getAsDouble() {
        return Optional.ofNullable(isDouble() ? ((Double) root) : null);
    }

    @Override
    public boolean isFloat() {
        return root instanceof Float;
    }

    @Override
    public Optional<Float> getAsFloat() {
        return Optional.ofNullable(isFloat() ? ((Float) root) : null);
    }

    @Override
    public boolean isBoolean() {
        return root instanceof Boolean;
    }

    @Override
    public Optional<Boolean> getAsBoolean() {
        return Optional.ofNullable(isBoolean() ? ((Boolean) root) : null);
    }

}
