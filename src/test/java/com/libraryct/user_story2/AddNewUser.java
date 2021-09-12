package com.libraryct.user_story2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewUser {
    public static void main(String[] args) throws InterruptedException {

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

        Thread.sleep(3000);
        // click on user tab
        WebElement userTab = driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]"));
        userTab.click();

        Thread.sleep(3000);

        // click add new user tab
        WebElement addNewUser = driver.findElement(By.xpath("//*[@id=\"users\"]/div[1]/div[1]/span/a"));
        addNewUser.click();

        // add info for new user
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("John Doe");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("johndoe123");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johndoe@gmail.com");

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys("1234 oak street seattle wa 98146");

        Thread.sleep(3000);

        //click submit
        WebElement saveChanges = driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[2]/button[2]"));
        saveChanges.click();

        Thread.sleep(3000);
        //driver.quit();


    }
}
