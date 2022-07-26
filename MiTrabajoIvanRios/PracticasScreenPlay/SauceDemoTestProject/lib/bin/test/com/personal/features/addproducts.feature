#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Agregr Productos al Carrito
  

  @tag1
  Scenario: Add Items to Shopping Cart
    Given "Ivan" este logueado
    	|username|standard_user|
    	|password|secret_sauce |
    When agregue los productos
    	| Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    Then ve los productos agregados en el carrito
    