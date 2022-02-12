package com.libraryct.tests;

import com.libraryct.utility.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUser {

    // get locators for adding user form
    @FindBy(xpath = "")

    public AddNewUser(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
