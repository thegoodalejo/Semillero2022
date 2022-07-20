#Author: mario.garcia@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Login
    Given "Mario" se encuentra en la pagina principal
      | url      | https://demo.guru99.com/test/newtours/ |
      | username | admin                                  |
      | password |                                 123456 |
    When Ingresa su username y password
    Then Visualiza el mensaje de "Login exitoso"