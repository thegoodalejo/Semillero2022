#Author: your.email@your.domain.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Iniciar sesion en la pagina
    Given "jeffer" ingreso a la pagina principal
    When diligencio el formulario de login
      | user | standard_user              |
      | pass | secret_sauce               |
    Then le redirecciono a la pagina de inventario
