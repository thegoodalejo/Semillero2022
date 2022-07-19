#Author: jefferson.cardenas@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    Given "jeffer" ingreso a la pagina principal
    When diligencio el formulario de login
      | user | standard_user |
      | pass | secret_sauce  |
    Then le redirecciono a la pagina de inventario

  Scenario: Agregar productos al carrito
    Given "Jeffer" se ha autenticado
    When agrego productos al carrito
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    Then vio los productos agregados en el carrito
