package com.libraryct.user_story3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddNewBook {
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

        // click on book tab
        WebElement userTab = driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[3]/a/span[1]"));
        userTab.click();

        Thread.sleep(3000);

        // click add new book tab
        WebElement addNewBook = driver.findElement(By.xpath("//*[@id=\"books\"]/div[1]/div[1]/span/a"));
        addNewBook.click();
        Thread.sleep(3000);

        // add info for new book
        // name
        WebElement bookName = driver.findElement(By.name("name"));
        bookName.click();
        bookName.sendKeys("The Kite Runner");
    }
}
