package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Utility {
    /**
     * logger defined to print log
     */
    private static final Logger log = LogManager.getLogger(CartPage.class.getName());

    public CartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public void clickOnCheckoutTab(){
        log.info("Click on checkout button : " + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

}
