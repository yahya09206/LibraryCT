package com.libraryct.tests;

import com.libraryct.pages.LoginPage;
import com.libraryct.utility.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUser {

    @Test
    public void addUserTest(){

        // login
        LoginPage loginPage = new LoginPage();
        // method to go to login page
        loginPage.goTo();
    }
}
