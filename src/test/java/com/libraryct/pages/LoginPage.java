package com.libraryct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "")
    private WebElement usernameBox;

    @FindBy(xpath = "")
    private WebElement passwordBox;

    @FindBy(xpath = "")
    private WebElement submitBtn;
}
