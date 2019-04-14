package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;
import dev.kryotek.sjf4j.JsonPrimitive;
import net.minidev.json.JSONArray;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SmartJsonArray implements JsonArray {

    private final JSONArray jsonArray;

    public SmartJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    @Override
    public Optional<Json> get(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonObject> getAsJsonObject(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonArray> getAsJsonArray(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonPrimitive> getAsJsonPrimitive(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getAsString(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Character> getAsCharacter(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Number> getAsNumber(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<BigInteger> getAsBigInteger(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Long> getAsLong(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> getAsInteger(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Short> getAsShort(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Byte> getAsByte(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Double> getAsDouble(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Float> getAsFloat(int index) {
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> getAsBoolean(int index) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return 0;
    }
}
