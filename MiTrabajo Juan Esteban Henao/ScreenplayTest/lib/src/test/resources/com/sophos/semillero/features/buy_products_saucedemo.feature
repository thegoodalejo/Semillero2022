#Author: juan.henaor@sophossolutions.com
Feature: Buy products
  I want to use this template for my feature file

 	 Background: 
    Given "user" was in the login page
      | url      | https://www.saucedemo.com/ |
      | userName | standard_user              |
      | password | secret_sauce               |
    When "user" was login in
    Then "user" saw the message login success
    Given the "user" is authenticated
    When add products to cart
    Then saw the products in the cart

  Scenario: Buy products
    Given the "user" has added products to the cart
    When finalizes the purchase of the products
      | firsName   | Juan   |
      | lastName   | Henao  |
      | postalCode | 630001 |
    Then view the purchase confirmation
    And view the purchase invoice
