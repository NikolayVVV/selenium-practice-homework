package ru.buttonone.utills;

import lombok.SneakyThrows;

import java.io.InputStream;
import java.util.Properties;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("application.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("properties.getProperty(\"url\") = " + properties.getProperty("url"));
    }
}
