#Author: juan.henaor@sophossolutions.com
Feature: PhpTravelsVisa

  Scenario: PhpTravelsVisa
    Given "user" was in the main page
      | url | https://www.phptravels.net/ |
    And stay in the visa tab
    When the complete the info
      | fromCountry | Colombia       |
      | toCountry   | United States  |
      | date        | 8-8-2022       |
      | firstName   | Juan           |
      | lastName    | Henao          |
      | email       | juan@email.com |
      | phone       |        7653232 |
      | dates       | 27-07-2022     |
      | notes       | Nothing        |
    Then "user" saw the message "Your visa form has been submitted"
