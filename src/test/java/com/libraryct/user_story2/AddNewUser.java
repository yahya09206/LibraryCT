package com.libraryct.user_story2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewUser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        // set up to sign in
        WebElement siginBox = driver.findElement(By.id("inputEmail"));
        siginBox.sendKeys("librarian47@library");

        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("Sdet2022*");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        submit.click();

        // click on user tab

    }
}
