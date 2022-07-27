#Author: juan.henaor@sophossolutions.com
Feature: Service jpetstore login

  Scenario: Service jpetstore login
    Given connect to the base url "https://petstore.octoperf.com"
    When send user information to the endpoint "/actions/Account.action"
      | username | j2ee |
      | password | j2ee |
    Then saw that the status code is 200
