package com.libraryct.utility;


import org.openqa.selenium.WebDriver;

/**
 * Want to have a class with that only returns Single object
 * no matter how many times you asked for object
 * creating this class with technique from Singleton Pattern
 */
public class Driver {

    private static WebDriver obj;
}
