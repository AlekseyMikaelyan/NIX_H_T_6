package org.example.shopproject.config;

import org.example.shopproject.config.impl.JavaApplicationConfiguration;

import java.lang.reflect.InvocationTargetException;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {
        config = new JavaApplicationConfiguration("org.example.shopproject");
    }

    public static ObjectFactory getInstance() {
        if(instance == null) {
            return new ObjectFactory();
        }
        return instance;
    }

    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if(type.isInterface()) {
            implClass = config.getCurrentImplementation(type);
        }
        T t = null;
        try {
            t = implClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("невозможно создать класс: " + e.getClass().getName());
        }
        return t;
    }
}

