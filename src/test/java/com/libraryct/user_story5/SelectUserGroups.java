package com.libraryct.user_story5;

import com.libraryct.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

        // click on user tab
        WebElement userTab = driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]"));
        userTab.click();
        Thread.sleep(3000);

        // select user group drown
        WebElement userGroupDropDown = driver.findElement(By.xpath("//*[@id=\"user_groups\"]"));
        userGroupDropDown.click();

        Thread.sleep(3000);
        List<WebElement> userGroupList = driver.findElements(By.xpath("//*[@id=\"user_groups\"]/option"));
//        System.out.println("userGroupList.size() = " + userGroupList.size());

       int expectedSize = 3;
       int actualSize = userGroupList.size();
       assertEquals(expectedSize, actualSize);


        Thread.sleep(3000);

    }

    @Test
    public void selectUserStatus() throws InterruptedException {

        driver.get("http://library2.cybertekschool.com/login.html");
        // set up to sign in
        WebElement siginBox = driver.findElement(By.id("inputEmail"));
        siginBox.sendKeys("librarian47@library");

        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("Sdet2022*");

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
        submit.click();

        // click on user tab
        WebElement userTab = driver.findElement(By.xpath("//*[@id=\"menu_item\"]/li[2]/a/span[1]"));
        userTab.click();
        Thread.sleep(3000);

        // select user status drop down
        WebElement selectUserStatus = driver.findElement(By.xpath("//*[@id=\"user_status\"]"));
        selectUserStatus.click();

        // count how many list items from dropdown
        List<WebElement> userStatusList = driver.findElements(By.xpath("//*[@id=\"user_status\"]/option"));
        System.out.println("userStatusList.size() = " + userStatusList.size());

        // check if assertion is true
        int expectedNum = 2;
        int actualNum = userStatusList.size();
        assertEquals(expectedNum, actualNum);

    }

}
