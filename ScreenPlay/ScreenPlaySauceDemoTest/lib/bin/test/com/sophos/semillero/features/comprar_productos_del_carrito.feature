#Author: your.email@your.domain.com
Feature: Comprar productos del carrito

  Background: 
    Given "jeffer" ingreso a la pagina principal
    When diligencio el formulario de login
      | user | standard_user |
      | pass | secret_sauce  |
    Then le redirecciono a la pagina de inventario


  Scenario: Comprar productos del carrito
    Given "Jeffer" tiene productos agregados al carrito
    When hizo un checkout de los productos
    Then vio un mensaje de compra exitosa
