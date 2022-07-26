#Author: juan.martinezs@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Login
    Given "JUANSE" se encuentra en la pagina principal
      | url      | https://demo.guru99.com/test/newtours/ |
      | userName | admin                                  |
      | password | admin                                  |
    When Ingresa credenciales
    Then visualiza el mensaje de "Login exitoso"
