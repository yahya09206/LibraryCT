package com.libraryct.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser {

    @FindBy(xpath = "//li/a/span[text()='Users']")
    private WebElement usersTab;
}
