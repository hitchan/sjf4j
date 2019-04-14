package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;
import dev.kryotek.sjf4j.JsonPrimitive;
import net.minidev.json.JSONObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class SmartJsonObject implements JsonObject {

    private final JSONObject jsonObject;

    public SmartJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public boolean has(String member) {
        return false;
    }

    @Override
    public Optional<Json> get(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonObject> getAsJsonObject(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonArray> getAsJsonArray(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<JsonPrimitive> getAsJsonPrimitive(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<String> getAsString(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Character> getAsCharacter(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Number> getAsNumber(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<BigInteger> getAsBigInteger(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Long> getAsLong(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> getAsInteger(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Short> getAsShort(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Byte> getAsByte(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Double> getAsDouble(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Float> getAsFloat(String member) {
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> getAsBoolean(String member) {
        return Optional.empty();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Set<Map.Entry<String, Json>> entrySet() {
        return null;
    }

    @Override
    public Set<String> keySet() {
        return null;
    }
}
