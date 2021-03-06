package com.libraryct.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * A Utility class that load the keyvalue pair inside config.properties file
 * into Properties object and provide single method called
 * read to get the value out of the properties file we created.
 */
public class ConfigReader {

    // Declare properties object at class level, so it can be accessible in static method
    private static Properties properties = new Properties();

    // only want to load file once, so we can use static block
    static {
        // get the path and open the file
        try {
            FileInputStream in = new FileInputStream("config.properties");
            // load the opened file in properties object
            properties.load(in);
            // close the file in JVM Memory
            in.close();
        } catch (IOException e){
            System.out.println("Error occurred while reading config.properties " + e.getMessage());
        }
    }

    // Use the object to read from the config.properties file
    public static String read(String key){
        return properties.getProperty(key);
    }
}
