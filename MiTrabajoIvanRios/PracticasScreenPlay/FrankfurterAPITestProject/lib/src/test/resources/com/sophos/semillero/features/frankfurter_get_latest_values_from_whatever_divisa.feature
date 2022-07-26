 #Author: ivan.riosa@sophossolutions.com
@tag
Feature: Get the Forex values based in whatever divisa value

  @tag1
  Scenario Outline: See the forex values of the main divisas based in whatever divisa value
    Given "user" sets the base url "https://api.frankfurter.app/"
    When opens the endpoint "latest?from=" for "<divisa>"
    Then can see the forex list values

    Examples: 
      | divisa |
      | USD    |
      | GBP    |
      | JPY    |
      | CAD    |
  