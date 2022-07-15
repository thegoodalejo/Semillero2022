#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given "Ivan" se encuentra en la pagina principal
    | url      | https://demo.guru99.com/selenium/newtours/ |
    | userName | admin                                      |
    | password | admin                                      |
    When Ingresa Usuario y Contrasenia
    Then Visualiza el mensaje "Login Exitoso"
    
