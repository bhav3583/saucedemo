package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends Utility {
    /**
     * logger defined to print log
     */
    private static final Logger log = LogManager.getLogger(ProductsPage.class.getName());

    public ProductsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@class='product_sort_container']")
    WebElement sortByDropDown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_list']/div[1]/div/div/button")
    WebElement costlierProduct;

    @CacheLookup
    @FindBy(xpath = "//div[@class='inventory_list']/div[6]/div/div/button")
    WebElement cheapestProduct;

    @CacheLookup
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement addToCartButton;

    public void selectOptionFromDropDown(String text) {
        selectByVisibleTextFromDropDown(sortByDropDown, text);
        log.info("Selecting by : " + sortByDropDown.toString());
    }
    public void selectCostlierProduct() {
        clickOnElement(costlierProduct);
        log.info("Selecting Costlier Product : " + costlierProduct.toString());
    }

    public void selectCheapestProduct() {
        clickOnElement(cheapestProduct);
        log.info("Selecting Cheapest Product : " + cheapestProduct.toString());
    }

    public void clickOnShoppingCartButton() {
        clickOnElement(addToCartButton);
        log.info("Clicking On Shopping Cart Button  : " + addToCartButton.toString());
    }

}
