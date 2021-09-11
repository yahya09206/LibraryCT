package com.libraryct.user_story1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LibraryLogin {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

            // verify librarian is on the login page
            if (driver.getTitle().equals("Login - Library")) {
                System.out.println("Titles match");
            } else {
                System.out.println("Titles do not match, expected title is Login - Library");
            }

            // set up to sign in
            WebElement siginBox = driver.findElement(By.id("inputEmail"));
            siginBox.sendKeys("librarian47@library");

            WebElement passwordBox = driver.findElement(By.id("inputPassword"));
            passwordBox.sendKeys("Sdet2022*");

            WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
            submit.click();

            Thread.sleep(2000);
            List<WebElement> modules = driver.findElements(By.className("title"));

            if (modules.size() == 3) {
                System.out.println("Test passed, actual number of modules are matching with expected result ");
            } else {
                System.out.println("Test failed. Actual number of modules are: " + modules.size());
            }
            Thread.sleep(2000);
//        for (WebElement eachModule : modules) {
//            System.out.println("eachModule.getText() = " + eachModule.getText());
//        }
        // quit driver
        //driver.quit();

        // select drop down
        WebElement dropDownMenu = driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]"));
        dropDownMenu.click();


    }
}

//Credentials
//librarian47@library pw: Sdet2022*