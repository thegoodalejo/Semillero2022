#Author: juan.henaor@sophossolutions.com


Feature: Add products to car


  Scenario: Add products to car
    Given the "user" is authenticated
    When add products to cart
    Then saw the products in the cart



