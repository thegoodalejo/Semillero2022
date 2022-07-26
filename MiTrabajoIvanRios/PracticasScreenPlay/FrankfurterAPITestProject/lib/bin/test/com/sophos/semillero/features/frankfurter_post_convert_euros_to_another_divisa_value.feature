#Author: ivan.riosa@sophossolutions.com
@tag
Feature: Convert euros to another divisa value

  @tag1
  Scenario: Convert a EUR quantity to another divisa value
    Given "user" sets the base url "https://api.frankfurter.app/"
    When send the quantity and divisa value to convert and "latest" endpoint
      | divisa | quantity |
      | CAD    |        2 |
      | GBP    |        5 |
      | JPY    |        4 |
      | NZD    |       10 |
      | CHF    |        3 |
      | USD    |       40 |
    Then can convert euros to another divisa value

    