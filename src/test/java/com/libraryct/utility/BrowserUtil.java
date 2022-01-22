package com.libraryct.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    public static void waitFor(int seconds){

        // sleep in seconds
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method will check for visibility of element within the time given
     * @param locator By.id or By.xpath or By.whatever
     * @param timeToWait time to wait
     * @return true if the element is found within the time and visible , false if not
     */
    public static boolean checkVisibilityOfElement(By locator, int timeToWait){

        boolean result = false;

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver())

    }
}
