#Author: your.email@your.domain.com
Feature: SauceDemo Login

  Scenario: Iniciar sesion exitosamente en la pagina
    Given "jeffer" ingreso a la pagina principal
    When diligencio el formulario de login
      | user | standard_user              |
      | pass | secret_sauce               |
    Then le redirecciono a la pagina de inventario
