package dev.kryotek.sjf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public interface JsonArray {

    boolean has(int index);

    Optional<Json> get(int index);

    default Optional<JsonObject> getAsJsonObject(int index) {
        return get(index).map(json -> json.getAsJsonObject().orElse(null));
    }

    default Optional<JsonArray> getAsJsonArray(int index) {
        return get(index).map(json -> json.getAsJsonArray().orElse(null));
    }

    default Optional<String> getAsString(int index) {
        return get(index).map(json -> json.getAsString().orElse(null));
    }

    default Optional<Character> getAsCharacter(int index) {
        return get(index).map(json -> json.getAsCharacter().orElse(null));
    }

    default Optional<Number> getAsNumber(int index) {
        return get(index).map(json -> json.getAsNumber().orElse(null));
    }

    default Optional<BigInteger> getAsBigInteger(int index) {
        return get(index).map(json -> json.getAsBigInteger().orElse(null));
    }

    default Optional<Long> getAsLong(int index) {
        return get(index).map(json -> json.getAsLong().orElse(null));
    }

    default Optional<Integer> getAsInteger(int index) {
        return get(index).map(json -> json.getAsInteger().orElse(null));
    }

    default Optional<Short> getAsShort(int index) {
        return get(index).map(json -> json.getAsShort().orElse(null));
    }

    default Optional<Byte> getAsByte(int index) {
        return get(index).map(json -> json.getAsByte().orElse(null));
    }

    default Optional<BigDecimal> getAsBigDecimal(int index) {
        return get(index).map(json -> json.getAsBigDecimal().orElse(null));
    }

    default Optional<Double> getAsDouble(int index) {
        return get(index).map(json -> json.getAsDouble().orElse(null));
    }

    default Optional<Float> getAsFloat(int index) {
        return get(index).map(json -> json.getAsFloat().orElse(null));
    }

    default Optional<Boolean> getAsBoolean(int index) {
        return get(index).map(json -> json.getAsBoolean().orElse(null));
    }

    int size();

}
