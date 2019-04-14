package dev.kryotek.sjf4j;

public interface JsonProvider {

    Json wrap(Object json);

    boolean supports(Class<?> clazz);

}
