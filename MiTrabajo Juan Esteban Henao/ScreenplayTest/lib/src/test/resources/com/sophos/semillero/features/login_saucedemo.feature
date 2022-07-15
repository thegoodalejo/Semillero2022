#Author: juan.henaor@sophossolutions.com
Feature: Login Sauce demo

  Scenario: LogIn Sauce demo
    Given "user" was in the login page
      | url      | https://www.saucedemo.com/ |
      | userName | standard_user              |
      | password | secret_sauce               |
    When "user" was login in
    Then "user" saw the message login success
