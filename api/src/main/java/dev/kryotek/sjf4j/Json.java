package dev.kryotek.sjf4j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public interface Json {

    boolean isJsonObject();

    Optional<JsonObject> getAsJsonObject();

    boolean isJsonArray();

    Optional<JsonArray> getAsJsonArray();

    boolean isString();

    Optional<String> getAsString();

    boolean isCharacter();

    Optional<Character> getAsCharacter();

    boolean isNumber();

    Optional<Number> getAsNumber();

    boolean isBigInteger();

    Optional<BigInteger> getAsBigInteger();

    boolean isLong();

    Optional<Long> getAsLong();

    boolean isInteger();

    Optional<Integer> getAsInteger();

    boolean isShort();

    Optional<Short> getAsShort();

    boolean isByte();

    Optional<Byte> getAsByte();

    boolean isBigDecimal();

    Optional<BigDecimal> getAsBigDecimal();

    boolean isDouble();

    Optional<Double> getAsDouble();

    boolean isFloat();

    Optional<Float> getAsFloat();

    boolean isBoolean();

    Optional<Boolean> getAsBoolean();

}
