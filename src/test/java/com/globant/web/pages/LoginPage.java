package com.globant.web.pages;

import com.globant.web.util.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage {
    @FindBy(id="user-name")
    private WebElement userName;
    @FindBy(id="password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement btnlogin;

    @FindBy(className = "login_logo")
    private WebElement textLogin;

    public String comprobateLogin(){
        return textLogin.getText();
    }

    public void enterLoginPage(String user, String psw){
        userName.sendKeys(user);
        password.sendKeys(psw);
        btnlogin.click();
    }

    public LoginPage(WebDriver driver, String url){
        super(driver);
        super.driver.get(url);
    }
}
