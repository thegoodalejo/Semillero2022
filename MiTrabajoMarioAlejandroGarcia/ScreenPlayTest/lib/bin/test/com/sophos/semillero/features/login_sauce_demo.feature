#Author: mario.garcia@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Login
    Given "Mario" se encuentra en la pagina principal de SauceDemo
      | url      | https://www.saucedemo.com/ |
      | username | standard_user              |
      | password | secret_sauce               |
    When Ingresa sus credenciales
    Then Se redirige a la pagina de Inventario de productos
