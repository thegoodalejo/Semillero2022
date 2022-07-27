#Author: juan.henaor@sophossolutions.com
Feature: Service jpetstore catalog

  Scenario Outline: Service jpetstore catalog
    Given connect to the base url "https://petstore.octoperf.com"
    When we send application information "/actions/Catalog.action?viewCategory=&categoryId=", por referencia "<category>"
      | category | <category> |
      | color    | <color>    |
    Then saw that the status code is <code>

    Examples: 
      | category | color | code |
      | DOGS     | red   |  200 |
      | FISH     | blue  |  201 |
      | CATS     | green |  404 |
