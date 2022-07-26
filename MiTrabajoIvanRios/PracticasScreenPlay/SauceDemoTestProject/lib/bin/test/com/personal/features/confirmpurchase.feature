#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Confirm Purchase
  
  
  Background:
  	Given "Ivan" esta en la pagina principal
    	|url|https://www.saucedemo.com|
    When diligencie el formulario del login
    	|username|standard_user|
    	|password|secret_sauce | 
    Then es dirigido hacia la pagina de inventario

  @tag1
  Scenario: Confirm the purchase
    Given "Ivan" haya agregado productos al carrito
    	| Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    And haga clic en checkout
    When diligencie los datos
    	|	name	|	lastname	|	zipcode	|
    	| Ivan	| Rios			| 50001		|
    	| Fulano| Meza			| 10001		|
    And haga clic en Finish
    Then puedo ver el mensaje "THANK YOU FOR YOUR ORDER"
    


