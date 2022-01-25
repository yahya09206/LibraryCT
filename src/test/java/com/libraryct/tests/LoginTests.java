package com.libraryct.tests;

import com.libraryct.pages.LoginPage;
import com.libraryct.utility.BrowserUtil;
import com.libraryct.utility.ConfigReader;
import com.libraryct.utility.TestBase;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.jupiter.api.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginToPageTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigReader.read("username"), ConfigReader.read("password"));
        BrowserUtil.waitFor(4);
    }

    @Test
    public void loginAsStudentTesT(){

    }
}
