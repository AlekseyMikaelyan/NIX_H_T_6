package org.example.shopproject.config;

public class ObjectFactory {

    private static ObjectFactory instance;

    private ObjectFactory() { }

    public static ObjectFactory getInstance() {
        if(instance == null) {
            return new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        return null;
    }
}

