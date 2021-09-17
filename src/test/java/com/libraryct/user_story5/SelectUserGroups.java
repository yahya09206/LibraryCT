package com.libraryct.user_story5;

import com.libraryct.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectUserGroups extends TestBase {

    @Test
    public void selectUserGroup() throws InterruptedException {

        driver.get("http://library2.cybertekschool.com/login.html");
        // set up to sign in
        WebElement siginBox = driver.findElement(By.id("inputEmail"));
        siginBox.sendKeys("librarian47@library");

        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("Sdet2022*");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        submit.click();

        Thread.sleep(3000);

    }

}
