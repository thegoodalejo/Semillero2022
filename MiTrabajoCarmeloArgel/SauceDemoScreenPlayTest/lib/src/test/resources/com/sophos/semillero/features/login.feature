#Author: carmelo.argel@sophossolutions.com

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given "Argel" se encuentra en la pagina principal
      | url      | https://demo.guru99.com/test/newtours/ |
      | userName | argel											            |
      | password | 1992											              |
    When Ingresa usuario y contrasena
    Then Visualiza el mensaje de "Login Exitoso"
