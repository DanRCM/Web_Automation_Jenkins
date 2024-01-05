package com.globant.web.util;

import com.globant.web.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {
//    public static final String username = System.getenv("USERNAME");
//    public static final String password = System.getenv("PASSWORD");
    public WebDriver driver = new ChromeDriver();
    public LoginPage loginPage;
    public ProductPage productPage;
    public InformationPage informationPage;
    public YourCartPage yourCartPage;
    public FinishPage finishPage;
    public OverViewPage overViewPage;
    @BeforeClass
    public void setUp() {
        loginPage = new LoginPage(driver, "https://www.saucedemo.com/");
        productPage= new ProductPage(driver);
        informationPage = new InformationPage(driver);
        yourCartPage = new YourCartPage(driver);
        finishPage = new FinishPage(driver);
        overViewPage = new OverViewPage(driver);
//        System.out.println("Your webpage user is:"+ System.getProperty("USERNAME"));
//        System.out.println("Your webpage password is:"+ System.getProperty("PASSWORD"));
    }

    @AfterTest
    public void close(){
        driver.close();
    }
}
