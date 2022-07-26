#Author: your.email@your.domain.com

@tag
Feature: Get user by Id

  @tag1
  Scenario: Search an user through http get request
    Given I want to set the base url "https://gorest.co.in/"
    When I send the id "6223" to the endpoint "public/v2/users/"
    Then I see that name is equal to "john h"

