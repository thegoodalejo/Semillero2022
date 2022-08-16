#Author: juan.henaor@sophossolutions.com
Feature: Validate PDF

  Scenario: Validate PDF of banitsmo
    Given I was in the "https://www.banistmo.com/wps/portal/banistmo/personas/"
    When I went the PDF path
    Then I validate that the generated pdf is correct