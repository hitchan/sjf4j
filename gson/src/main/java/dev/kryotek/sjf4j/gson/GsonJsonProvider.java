package dev.kryotek.sjf4j.gson;

import com.google.gson.JsonElement;
import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonProvider;

public class GsonJsonProvider implements JsonProvider {

    @Override
    public Json wrap(Object json) {
        JsonElement jsonElement = (JsonElement) json;
        return new GsonJson(jsonElement);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return JsonElement.class.isAssignableFrom(clazz);
    }

}
