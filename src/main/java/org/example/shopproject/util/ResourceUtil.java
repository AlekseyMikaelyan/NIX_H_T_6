package org.example.shopproject.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.ClassLoader.getSystemResource;

public class ResourceUtil {

    public static Map<String, String> getResource(String text) {
        URL systemResource = ClassLoader.getSystemResource(text);
        String path = systemResource.getPath();
        try {
            Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
            return lines.map(line -> line.split("=")).collect(Collectors.toMap(arr -> arr[0], arr -> arr[1]));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден: " + e.getMessage());
        }
    }
}
