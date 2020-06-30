package org.example.shopproject.config;

import org.example.shopproject.config.impl.JavaApplicationConfiguration;
import org.example.shopproject.service.AccountantService;
import org.example.shopproject.service.impl.DirectorServiceImpl;
import org.example.shopproject.util.ResourceUtil;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {

    private static ObjectFactory instance;
    private ApplicationConfiguration config;

    private ObjectFactory() {
        config = new JavaApplicationConfiguration("org.example.shopproject", new HashMap<>(Map.of(AccountantService.class, DirectorServiceImpl.class)));
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

    private <T> void initFields(Class <T> type, T t) {
        Map<String, String> map = ResourceUtil.getResource("application.properties");
    }
}

