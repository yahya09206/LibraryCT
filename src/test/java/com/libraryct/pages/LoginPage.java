package com.libraryct.pages;

import com.libraryct.utility.ConfigReader;
import com.libraryct.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Sign in']")
    private WebElement loginBtn;

    // initialize driver using built in PageFactory
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * Navigate to login page
     */
    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("url"));
    }

    /**
     * Login into website
     */
    public void login(String username, String password){

        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginBtn.click();
    }
}
