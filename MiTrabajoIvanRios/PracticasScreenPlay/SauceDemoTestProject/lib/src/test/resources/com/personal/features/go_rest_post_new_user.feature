#Author: your.email@your.domain.com
@tag
Feature: Service GoRest

  @tag1
  Scenario: Create a new user
    Given I want to set the base url "https://gorest.co.in/"
    When I seend the information to "/public/v2/users"
      | name   | john h           |
      | email  | john25@gmail.com |
      | gender | male             |
      | status | active           |
    Then I hope status code 200
