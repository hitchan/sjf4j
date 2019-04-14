package dev.kryotek.sjf4j;

import org.jetbrains.annotations.NotNull;

import java.util.ServiceLoader;

public class JsonFactory {

    public static Json wrap(@NotNull Object json) {
        return findJsonProvider(json.getClass()).wrap(json);
    }

    private static JsonProvider findJsonProvider(@NotNull Class<?> clazz) {
        for (JsonProvider provider : ServiceLoader.load(JsonProvider.class)) {
            if (provider.supports(clazz)) {
                return provider;
            }
        }
        throw new JsonException(String.format("Unable to locate Json provider for: %s", clazz.getSimpleName()));
    }

}
