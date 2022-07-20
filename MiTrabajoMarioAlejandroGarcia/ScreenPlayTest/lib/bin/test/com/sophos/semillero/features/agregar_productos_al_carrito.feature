#Author: mario.garcia@sophossolutions.com

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
  Given "Mario" se encuentra en la pagina principal de SauceDemo
      | url      | https://www.saucedemo.com/ |
      | username | standard_user              |
      | password | secret_sauce               |
    When Ingresa sus credenciales
    Then Se redirige a la pagina de Inventario de productos

  Scenario: Agregar Productos al carrito
    Given El usuario se encuentra autenticado
    When Agrega productos al carrito
    Then Visualiza los productos agregados al carrito