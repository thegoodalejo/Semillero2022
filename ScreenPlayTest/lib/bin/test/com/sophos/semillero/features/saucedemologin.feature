#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Login Exitoso
  I want to use this template for my feature file

  @tag1
  Scenario: Inicio de Sesion
    Given "Ivan" se encuentra en la pagina del login
    | url      | https://www.saucedemo.com/ |
    | userName | standard_user              |
    | password | secret_sauce               |
    When llena los campos
    Then Visualiza la lista de productos
    
