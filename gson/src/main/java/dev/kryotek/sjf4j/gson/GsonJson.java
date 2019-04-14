package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonArray;
import dev.kryotek.sjf4j.JsonObject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class GsonJson implements Json {

    private final JsonElement root;

    public GsonJson(JsonElement root) {
        this.root = root;
    }

    @Override
    public boolean isJsonObject() {
        return root.isJsonObject();
    }

    @Override
    public Optional<JsonObject> getAsJsonObject() {
        return Optional.ofNullable(isJsonObject() ? new GsonJsonObject(root.getAsJsonObject()) : null);
    }

    @Override
    public boolean isJsonArray() {
        return root.isJsonArray();
    }

    @Override
    public Optional<JsonArray> getAsJsonArray() {
        return Optional.ofNullable(isJsonArray() ? new GsonJsonArray(root.getAsJsonArray()) : null);
    }

    @Override
    public boolean isString() {
        return root.isJsonPrimitive() && root.getAsJsonPrimitive().isString();
    }

    @Override
    public Optional<String> getAsString() {
        return Optional.ofNullable(isString() ? root.getAsString() : null);
    }

    @Override
    public boolean isCharacter() {
        return root.isJsonPrimitive() && root.getAsJsonPrimitive().isString();
    }

    @Override
    public Optional<Character> getAsCharacter() {
        return Optional.ofNullable(isString() ? root.getAsCharacter() : null);
    }

    @Override
    public boolean isNumber() {
        return root.isJsonPrimitive() && root.getAsJsonPrimitive().isNumber();
    }

    @Override
    public Optional<Number> getAsNumber() {
        return Optional.ofNullable(isNumber() ? root.getAsNumber() : null);
    }

    @Override
    public boolean isBigInteger() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsBigInteger();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<BigInteger> getAsBigInteger() {
        return Optional.ofNullable(isBigInteger() ? root.getAsBigInteger() : null);
    }

    @Override
    public boolean isLong() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsLong();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Long> getAsLong() {
        return Optional.ofNullable(isLong() ? root.getAsLong() : null);
    }

    @Override
    public boolean isInteger() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsInt();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Integer> getAsInteger() {
        return Optional.ofNullable(isInteger() ? root.getAsInt() : null);
    }

    @Override
    public boolean isShort() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsShort();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Short> getAsShort() {
        return Optional.ofNullable(isShort() ? root.getAsShort() : null);
    }

    @Override
    public boolean isByte() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsByte();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Byte> getAsByte() {
        return Optional.ofNullable(isByte() ? root.getAsByte() : null);
    }

    @Override
    public boolean isBigDecimal() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsBigDecimal();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<BigDecimal> getAsBigDecimal() {
        return Optional.ofNullable(isBigDecimal() ? root.getAsBigDecimal() : null);
    }

    @Override
    public boolean isDouble() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsDouble();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Double> getAsDouble() {
        return Optional.ofNullable(isDouble() ? root.getAsDouble() : null);
    }

    @Override
    public boolean isFloat() {
        try {
            if (!root.isJsonPrimitive()) {
                return false;
            }
            root.getAsJsonPrimitive().getAsFloat();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Float> getAsFloat() {
        return Optional.ofNullable(isFloat() ? root.getAsFloat() : null);
    }

    @Override
    public boolean isBoolean() {
        return root.isJsonPrimitive() && root.getAsJsonPrimitive().isBoolean();
    }

    @Override
    public Optional<Boolean> getAsBoolean() {
        return Optional.ofNullable(isBoolean() ? root.getAsBoolean() : null);
    }

}
