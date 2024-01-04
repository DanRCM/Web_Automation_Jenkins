package com.globant.web.pages;

import com.globant.web.util.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InformationPage extends BasePage {
    public InformationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="first-name")
    private WebElement fName;

    @FindBy(id="last-name")
    private WebElement lName;

    @FindBy(id="postal-code")
    private WebElement pCode;

    @FindBy(id="continue")
    private WebElement btnContinue;

    public void sentInformation(String first, String last, String postalC){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.and(
                ExpectedConditions.visibilityOfElementLocated(By.id("first-name")),
                ExpectedConditions.visibilityOfElementLocated(By.id("last-name")),
                ExpectedConditions.visibilityOfElementLocated(By.id("postal-code"))
        ));

        fName.sendKeys(first);
        lName.sendKeys(last);
        pCode.sendKeys(postalC);
    }

    public void clickOnContinue(){
        btnContinue.click();
    }
}
