package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends Utility {
    /**
     * logger defined to print log
     */
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());

    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='first-name']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last-name']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='finish']")
    WebElement finishButton;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='complete-header']")
    WebElement confirmMessage;

    public void enterPersonalInformationOnCheckOutPage(String fName, String lName, String pCode) {
        sendTextToElement(firstName, fName);
        log.info("Sending first name : " + firstName.toString());
        sendTextToElement(lastName, lName);
        log.info("Sending Last name : " + lastName.toString());
        sendTextToElement(postCode, pCode);
        log.info("Sending Postcode : " + postCode.toString());
    }


    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Clicking on Continue Button : " + continueButton.toString());
    }

    public void clickOnFinishButton() {
        clickOnElement(finishButton);
        log.info("Clicking on Finish Button : " + finishButton.toString());
    }

    public void verifyMessage(String expectedMessage) {
        Assert.assertTrue(confirmMessage.getText().equalsIgnoreCase(expectedMessage));
        log.info("Getting Confirm Message : " + confirmMessage.toString());
    }

}
