package com.globant.web.test;

import com.globant.web.util.BaseTest;
import com.globant.web.util.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PurchaseTest extends BaseTest{
    @Test
    public void LoginPage() {
        loginPage.enterLoginPage(username,password);
        productPage.addProduct();
        yourCartPage.clickOncheckout();
    }
    @Test(dataProvider = "PurchaseDataProvider", dataProviderClass = DataProviderTest.class)
    public void Test1(String name, String lastName, String postalIC, String expected){
        informationPage.sentInformation(name,lastName,postalIC);
        informationPage.clickOnContinue();
        overViewPage.clickOnFinish();
        Assert.assertEquals(finishPage.getText(), expected);
    }
}