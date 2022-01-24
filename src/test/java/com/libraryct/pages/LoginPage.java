package com.libraryct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement usernameBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement submitBtn;
}
