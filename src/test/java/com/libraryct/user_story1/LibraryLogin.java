package com.libraryct.user_story1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LibraryLogin {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        // verify librarian is on the login page
        if (driver.getTitle().equals("Login - Library")){
            // set up to sign in
            WebElement siginBox = driver.findElement(By.id("inputEmail"));
            siginBox.sendKeys("librarian47@library");
            WebElement passwordBox = driver.findElement(By.id("inputPassword"));
            passwordBox.sendKeys("Sdet2022*");
            WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
            submit.click();
        }
        List<WebElement> modules = driver.findElements(By.xpath("//*[@id=\"dashboard\"]/div/div/div[1]/div"));
        for (WebElement eachModule : modules) {
            if (modules.equals(3)){
                System.out.println("Page displays 3 modules");
            }else {
                System.out.println("Page does not contain 3 modules");
            }
        }

        Thread.sleep(3000);
        // quit driver
        // driver.quit();
    }
}

//Credentials
//librarian47@library pw: Sdet2022*