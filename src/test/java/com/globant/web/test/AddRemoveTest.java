package com.globant.web.test;

import com.globant.web.util.BaseTest;
import com.globant.web.util.DataProviderTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTest {

    @Test
    public void test2() {
        loginPage.enterLoginPage(username,password);
        productPage.addThreeProducts();
        yourCartPage.removeThreeElements();
        Assert.assertEquals(yourCartPage.comprobateShoopingCart(),"");
    }

}
