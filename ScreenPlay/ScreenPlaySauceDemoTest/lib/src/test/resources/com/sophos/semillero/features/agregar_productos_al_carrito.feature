#Author: jefferson.cardenas@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Agregar productos al carrito
    Given "Jeffer" se ha autenticado
      | user | standard_user |
      | pass | secret_sauce  |
    When agrego productos al carrito
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    Then vio los productos agregados en el carrito
