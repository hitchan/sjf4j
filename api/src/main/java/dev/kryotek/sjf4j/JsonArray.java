package dev.kryotek.sjf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public interface JsonArray {

    boolean has(int index);

    Optional<Json> get(int index);

    Optional<JsonObject> getAsJsonObject(int index);

    Optional<JsonArray> getAsJsonArray(int index);

    Optional<String> getAsString(int index);

    Optional<Character> getAsCharacter(int index);

    Optional<Number> getAsNumber(int index);

    Optional<BigInteger> getAsBigInteger(int index);

    Optional<Long> getAsLong(int index);

    Optional<Integer> getAsInteger(int index);

    Optional<Short> getAsShort(int index);

    Optional<Byte> getAsByte(int index);

    Optional<BigDecimal> getAsBigDecimal(int index);

    Optional<Double> getAsDouble(int index);

    Optional<Float> getAsFloat(int index);

    Optional<Boolean> getAsBoolean(int index);

    int size();

}
