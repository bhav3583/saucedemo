$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("purchase.feature");
formatter.feature({
  "line": 1,
  "name": "Search functionality",
  "description": "\r\nAs a user i want to purchase cheapest and costliest product from the sauceDemo after sorting the products by high to low filter",
  "id": "search-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3532708800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates sauceDemo page and complete the item purchases",
  "description": "",
  "id": "search-functionality;user-navigates-saucedemo-page-and-complete-the-item-purchases",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on sauceDemo page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter username \"standard_user\" and password \"secret_sauce\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I filter the products by price \"Price (high to low)\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I select cheapest \u0026 costliest products from the list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I open shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I go to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter firstname \"firstName\",\"lastname\" and \"postcode\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on finish button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I should verify \"THANK YOU FOR YOUR ORDER\"message",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseSteps.iAmOnSauceDemoPage()"
});
formatter.result({
  "duration": 113919100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 18
    },
    {
      "val": "secret_sauce",
      "offset": 47
    }
  ],
  "location": "PurchaseSteps.iEnterUsernameAndPassword(String,String)"
});
formatter.result({
  "duration": 215294700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 203821800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Price (high to low)",
      "offset": 32
    }
  ],
  "location": "PurchaseSteps.iFilterTheProductsByPrice(String)"
});
formatter.result({
  "duration": 117942600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iSelectCheapestCostliestProductsFromTheList()"
});
formatter.result({
  "duration": 96114400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iOpenShoppingCart()"
});
formatter.result({
  "duration": 47693500,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iGoToCheckout()"
});
formatter.result({
  "duration": 40929800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "firstName",
      "offset": 19
    },
    {
      "val": "lastname",
      "offset": 31
    },
    {
      "val": "postcode",
      "offset": 46
    }
  ],
  "location": "PurchaseSteps.iEnterFirstnameAnd(String,String,String)"
});
formatter.result({
  "duration": 182866100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 54746700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iClickOnFinishButton()"
});
formatter.result({
  "duration": 44452000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 17
    }
  ],
  "location": "PurchaseSteps.iShouldVerifyMessage(String)"
});
formatter.result({
  "duration": 26931800,
  "status": "passed"
});
formatter.after({
  "duration": 650112300,
  "status": "passed"
});
});