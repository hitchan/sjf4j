package dev.kryotek.sjf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface JsonObject {

    boolean has(String member);

    Optional<Json> get(String member);

    default Optional<JsonObject> getAsJsonObject(String member) {
        return get(member).map(json -> json.getAsJsonObject().orElse(null));
    }

    default Optional<JsonArray> getAsJsonArray(String member) {
        return get(member).map(json -> json.getAsJsonArray().orElse(null));
    }

    default Optional<String> getAsString(String member) {
        return get(member).map(json -> json.getAsString().orElse(null));
    }

    default Optional<Character> getAsCharacter(String member) {
        return get(member).map(json -> json.getAsCharacter().orElse(null));
    }

    default Optional<Number> getAsNumber(String member) {
        return get(member).map(json -> json.getAsNumber().orElse(null));
    }

    default Optional<BigInteger> getAsBigInteger(String member) {
        return get(member).map(json -> json.getAsBigInteger().orElse(null));
    }

    default Optional<Long> getAsLong(String member) {
        return get(member).map(json -> json.getAsLong().orElse(null));
    }

    default Optional<Integer> getAsInteger(String member) {
        return get(member).map(json -> json.getAsInteger().orElse(null));
    }

    default Optional<Short> getAsShort(String member) {
        return get(member).map(json -> json.getAsShort().orElse(null));
    }

    default Optional<Byte> getAsByte(String member) {
        return get(member).map(json -> json.getAsByte().orElse(null));
    }

    default Optional<BigDecimal> getAsBigDecimal(String member) {
        return get(member).map(json -> json.getAsBigDecimal().orElse(null));
    }

    default Optional<Double> getAsDouble(String member) {
        return get(member).map(json -> json.getAsDouble().orElse(null));
    }

    default Optional<Float> getAsFloat(String member) {
        return get(member).map(json -> json.getAsFloat().orElse(null));
    }

    default Optional<Boolean> getAsBoolean(String member) {
        return get(member).map(json -> json.getAsBoolean().orElse(null));
    }

    int size();

    Set<Map.Entry<String, Json>> entrySet();

    Set<String> keySet();

}
