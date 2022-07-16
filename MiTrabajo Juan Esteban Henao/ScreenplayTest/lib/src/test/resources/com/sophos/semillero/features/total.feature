#Author: juan.henaor@sophossolutions.com
	Feature: Agrupacion

  Scenario: Total
    Given "user" was in the login page
      | url      | https://www.saucedemo.com/ |
      | userName | standard_user              |
      | password | secret_sauce               |
    And "user" was login in
    And "user" saw the message login success
    When the "user" is authenticated
    And add products to cart
    And saw the products in the cart
    Then the "user" has added products to the cart
    And finalizes the purchase of the products
      | firsName   | Juan   |
      | lastName   | Henao  |
      | postalCode | 630001 |
    And view the purchase confirmation
    And view the purchase invoice