package com.libraryct.tests;

import com.libraryct.pages.LoginPage;
import com.libraryct.utility.BrowserUtil;
import com.libraryct.utility.ConfigReader;
import com.libraryct.utility.TestBase;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {
    LoginPage loginPage = new LoginPage();
    @Test
    public void loginToPageTest(){

        loginPage.goTo();
        loginPage.login(ConfigReader.read("username"), ConfigReader.read("password"));
        BrowserUtil.waitFor(4);
    }

    @Test
    public void loginAsAdminTest(){

        loginPage.goTo();
        loginPage.login(ConfigReader.read("username2"), ConfigReader.read("password"));
        BrowserUtil.waitFor(4);
    }

    @Test
    public void loginNegativeTest(){

        loginPage.
    }
}
