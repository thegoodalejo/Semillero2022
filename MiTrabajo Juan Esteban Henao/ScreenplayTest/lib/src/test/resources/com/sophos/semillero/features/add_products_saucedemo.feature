#Author: juan.henaor@sophossolutions.com


Feature: Add products to car

		Background:
    Given "user" was in the login page
      | url      | https://www.saucedemo.com/ |
      | userName | standard_user              |
      | password | secret_sauce               |
    When "user" was login in
    Then "user" saw the message login success


  Scenario: Add products to car
    Given the "user" is authenticated
    When add products to cart
    Then saw the products in the cart



