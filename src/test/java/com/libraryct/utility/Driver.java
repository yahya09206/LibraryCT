package com.libraryct.utility;


import org.openqa.selenium.WebDriver;

/**
 * Want to have a class with that only returns Single object
 * no matter how many times you asked for object
 * creating this class with technique from Singleton Pattern
 */
public class Driver {

    private static WebDriver obj;

    private Driver(){

    }

    /**
     * Return obj with only one WebDriver instance
     * @return some WebDriver if it exists, new one if null
     */
    public static WebDriver getDriver(){

        // read the browser type you want to launch from properties file
        // String browserName = ConfigReader.read("browser");

        // check if object is null
        if (obj == null){
            //according to browser type set up driver correctly

        }
    }

}
