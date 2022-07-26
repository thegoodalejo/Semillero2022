#Author: ivan.riosa@sophossolutions.com
@tag
Feature: Get convertions between divisas values

  @tag1
  Scenario Outline: See the forex conversion between diferent divisas values
    Given "user" sets the base url "https://api.frankfurter.app/"
    When opens the endpoint "latest?amount=" to a <value> "&from=" divisa "<origin>" to "&to=" divisa "<destination>"
    Then can see the forex list values

    Examples: 
      | value | origin | destination |
      |     5 | USD    | CAD         |
      |    20 | JPY    | GBP         |
      |    15 | USD    | EUR         |
      |   100 | GBP    | USD         |
