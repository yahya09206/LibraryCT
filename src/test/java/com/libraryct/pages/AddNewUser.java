package com.libraryct.pages;

import com.libraryct.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUser {

    @FindBy(xpath = "//li/a/span[text()='Users']")
    private WebElement usersTab;

    public AddNewUser(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
