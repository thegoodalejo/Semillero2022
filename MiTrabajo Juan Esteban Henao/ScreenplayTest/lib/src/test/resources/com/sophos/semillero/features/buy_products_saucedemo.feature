#Author: juan.henaor@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given the "user" has added products to the cart
    When finalizes the purchase of the products
      | firsName   | Juan   |
      | lastName   | Henao  |
      | postalCode | 630001 |
    Then view the purchase confirmation
    And view the purchase invoice
