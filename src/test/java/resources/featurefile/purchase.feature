Feature: Search functionality

  As a user i want to purchase cheapest and costliest product from the sauceDemo after sorting the products by high to low filter

  Scenario: User navigates sauceDemo page and complete the item purchases
    Given I am on sauceDemo page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on login button
    And I filter the products by price "Price (high to low)"
    And I select cheapest & costliest products from the list
    And I open shopping cart
    And I go to checkout
    And I enter firstname "firstName","lastname" and "postcode"
    And I click on continue button
    And I click on finish button
    Then I should verify "THANK YOU FOR YOUR ORDER"message



