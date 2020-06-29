package org.example.shopproject.config;

public interface ApplicationConfiguration {
    <T> Class<? extends T> getCurrentImplementation(Class<T> type);
}
