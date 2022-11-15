package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // Create the object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("key")
    // It is static because we using it in static method
    // it is private because i will be using only in this class
    private static Properties properties = new Properties();

    // We want to open the properties file and load to properties object ONLY ONCE before reading
    // having static block because static runs first
    static {

        try {
            // Create the object of FileInputStream
            // We need this object to open files as a stream in Java Memory
            FileInputStream file = new FileInputStream("config.properties");

            // Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            // close the file after loading
            // if we do not close the file, it will take space from computer memory
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in configuration.properties file
     * @return --> value for the key. Returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env"))
     */

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}




