package dev.kryotek.sjf4j.jsonsmart;

import dev.kryotek.sjf4j.Json;
import dev.kryotek.sjf4j.JsonProvider;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class SmartJsonProvider implements JsonProvider {

    @Override
    public Json wrap(Object json) {
        return new SmartJson(json);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return JSONObject.class.isAssignableFrom(clazz) || JSONArray.class.isAssignableFrom(clazz);
    }

}
