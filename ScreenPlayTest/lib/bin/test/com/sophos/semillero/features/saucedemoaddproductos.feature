#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Agregar productos al carrito
  I want to use this template for my feature file
	
	Background:
	Scenario: Inicio de Seison
    Given "Ivan" se encuentra en la pagina del login
    | url      | https://www.saucedemo.com/ |
    | userName | standard_user              |
    | password | secret_sauce               |

  @tag1
  Scenario: Agregar dos productos al carrito
    Given "Ivan" se encuentre logueado
    | url      | https://www.saucedemo.com/inventory.html/ |
    | product1 | Sauce Labs Backpack											|
    | product2 | Sauce Labs Bolt T-Shirt									|
    When Agrega los productos al carrito
    Then Visualiza el incremento de los productos en el logo del carrito
    
