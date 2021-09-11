package com.libraryct.user_story1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryLogin {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        // verify librarian is on the login page

        Thread.sleep(3000);
        // quit driver
        // driver.quit();
    }
}

//Credentials
//librarian47@library pw: Sdet2022*