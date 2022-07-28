#Author: your.email@your.domain.com
Feature: Comprar productos del carrito

  Background: 
    Given "jeffer" ingreso a la pagina principal
    When diligencio el formulario de login
      | user | standard_user |
      | pass | secret_sauce  |
    Then le redirecciono a la pagina de inventario

  Scenario: Comprar productos del carrito de manera exitosa
    Given "Jeffer" tiene productos agregados al carrito
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    When hizo un checkout de los productos
      | firstName | lastName | zipCode |
      | John      | Doe      |  133434 |
      | NotJohn   | NotDoe   | 1334366 |
    And vio la factura generada
    Then vio un mensaje de compra exitosa
