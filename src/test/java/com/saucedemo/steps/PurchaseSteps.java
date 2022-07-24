package com.saucedemo.steps;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PurchaseSteps {
    @Given("^I am on sauceDemo page$")
    public void iAmOnSauceDemoPage() {
        //
    }

    @When("^I enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        new HomePage().loginWithCorrectCredentials(userName, password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();
    }

    @And("^I filter the products by price \"([^\"]*)\"$")
    public void iFilterTheProductsByPrice(String dropDown) {
        new ProductsPage().selectOptionFromDropDown(dropDown);
    }

    @And("^I select cheapest & costliest products from the list$")
    public void iSelectCheapestCostliestProductsFromTheList() {
        new ProductsPage().selectCheapestProduct();
        new ProductsPage().selectCostlierProduct();
    }

    @And("^I open shopping cart$")
    public void iOpenShoppingCart() {
        new ProductsPage().clickOnShoppingCartButton();
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() {
        new CartPage().clickOnCheckoutTab();
    }

    @And("^I enter firstname \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterFirstnameAnd(String fName, String lName, String pCode) {
        new CheckOutPage().enterPersonalInformationOnCheckOutPage(fName, lName, pCode);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckOutPage().clickOnContinueButton();
    }

    @And("^I click on finish button$")
    public void iClickOnFinishButton() {
        new CheckOutPage().clickOnFinishButton();
    }

    @Then("^I should verify \"([^\"]*)\"message$")
    public void iShouldVerifyMessage(String message) {
        new CheckOutPage().verifyMessage(message);
    }


}
