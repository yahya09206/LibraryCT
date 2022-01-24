package com.libraryct.tests;

import com.libraryct.pages.LoginPage;
import com.libraryct.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPage(){

        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
    }
}
