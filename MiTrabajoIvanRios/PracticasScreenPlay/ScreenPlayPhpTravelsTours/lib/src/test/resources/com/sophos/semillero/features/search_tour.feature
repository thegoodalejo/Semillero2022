#Author: ivan.riosa@sophossolutions.com
@tag
Feature: Search a tour

  @tag1
  Scenario: Search the available tours
    Given "User" clicks on tour tab
    When fills the information
      | destination | date       | adults | child |
      | disney      | 25-07-2022 |      2 |     1 |
      | yellowstone | 28-07-2022 |      1 |     3 |
    Then should see the available list tours
