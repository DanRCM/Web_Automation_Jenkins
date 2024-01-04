package com.globant.web.test;

import com.globant.web.util.BaseTest;
import com.globant.web.util.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest{

    @Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderTest.class)
    public void test3(String user, String psw) {
        loginPage.enterLoginPage(user,psw);
        productPage.clickOnMenu();
        Assert.assertTrue(productPage.isElementDisplayed(productPage.getBtnLogout()));
        productPage.clickLogout();
        Assert.assertEquals(loginPage.comprobateLogin(), "Swag Labs");
    }

}
