package dev.kryotek.sjf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface JsonObject {

    boolean has(String member);

    Optional<Json> get(String member);

    Optional<JsonObject> getAsJsonObject(String member);

    Optional<JsonArray> getAsJsonArray(String member);

    Optional<String> getAsString(String member);

    Optional<Character> getAsCharacter(String member);

    Optional<Number> getAsNumber(String member);

    Optional<BigInteger> getAsBigInteger(String member);

    Optional<Long> getAsLong(String member);

    Optional<Integer> getAsInteger(String member);

    Optional<Short> getAsShort(String member);

    Optional<Byte> getAsByte(String member);

    Optional<BigDecimal> getAsBigDecimal(String member);

    Optional<Double> getAsDouble(String member);

    Optional<Float> getAsFloat(String member);

    Optional<Boolean> getAsBoolean(String member);

    int size();

    Set<Map.Entry<String, Json>> entrySet();

    Set<String> keySet();

}
