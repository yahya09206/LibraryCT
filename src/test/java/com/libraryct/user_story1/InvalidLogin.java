package com.libraryct.user_story1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://library2.cybertekschool.com/login.html");

        //Enter invalid credentials
        // set up to sign in
        WebElement siginBox = driver.findElement(By.id("inputEmail"));
        siginBox.sendKeys("library@library");

        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("Sdet2022*");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        submit.click();
        Thread.sleep(3000);
        
        //Checking what error message says
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div"));
        String alert = "Sorry, Wrong Email or Password";
        String actualMessage = errorMessage.getText();
        System.out.println("errorMessage.getText() = " + errorMessage.getText());

        // Checking if correct error message is being displayed
        if (alert.equals(actualMessage)){
            System.out.println("match");
        }else {
            System.out.println("not match");
        }

        driver.quit();
    }
}
