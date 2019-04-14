package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonProvider;

public class SmartJsonProvider implements JsonProvider {

    @Override
    public Json wrap(Object json) {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

}
