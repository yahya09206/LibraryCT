package com.libraryct.utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        String browserName = ConfigReader.read("browser");

        // check if object is null
        if (obj == null){
            //according to browser type set up driver correctly
            switch (browserName){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    break;
                default:
                    obj = null;
                    System.out.println("UNKNOWN BROWSER TYPE!!! " + browserName);
            }
            return obj;
        }else {
            return obj;
        }
    }

    /**
     * Quitting the browser and setting the value of
     * WebDriver instance to null because you can re-use already quit out of driver
     */
    public static void closeBrowser(){

        // check if obj is null or not
        // if not,
            // quit the browser
            // make it null, to avoid re-use of it
        if (obj != null){
            obj.quit();
            obj = null;
        }
    }

}
