package com.libraryct.user_story1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentLogin {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        // verify librarian is on the login page
        if (driver.getCurrentUrl().equals("http://library2.cybertekschool.com/login.html")) {
            System.out.println("Titles match");
        } else {
            System.out.println("Titles do not match, expected title is Login - Library");
        }
    }
}
