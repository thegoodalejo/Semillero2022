#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Get the Forex values based Euro value
  

  @tag1
  Scenario: See the forex values of the main divisas based in Euro value
    Given "user" sets the base url "https://api.frankfurter.app/"
    When opens the endpoint "latest"
    Then can see the forex list values
  