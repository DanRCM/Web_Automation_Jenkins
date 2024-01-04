package com.globant.web.pages;

import com.globant.web.util.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage extends BasePage {
    public OverViewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id ="finish")
    private WebElement btnFinish;

    public void clickOnFinish(){
        btnFinish.click();
    }
}
