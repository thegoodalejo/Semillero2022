Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given "Marlon" se encuentra en la pagina principal
      | url      | https://www.saucedemo.com/ |
      | username | standard_user              |
      | password | secret_sauce               |
    When Ingresa sus credenciales
    Then Se redirige a la pagina de Inventario de productos
