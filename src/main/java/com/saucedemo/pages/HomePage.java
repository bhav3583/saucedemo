package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    /**
     * logger defined to print log
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "user-name")
    WebElement userName;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(id = "login-button")
    WebElement loginButton;

    public void loginWithCorrectCredentials(String user, String pass) {
        sendTextToElement(userName, user);
        log.info("Enter UserName in username field : "+ userName.toString());
        sendTextToElement(password, pass);
        log.info("Enter Password in password field : "+ password.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on Login Button : " + loginButton.toString());
    }
}



