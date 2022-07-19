#Author: juan.morap@sophossolutioins.com

Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
     Given "standard_user" se encuentra en la pagina principal
    |url|https://www.saucedemo.com/|
    |username|standard_user|
    |password|secret_sauce|

    When Ingresa usuario y contrasena

    Then visualiza el mensaje de "Login exitoso"

  @tag2
  Scenario: Inventario
    Given "standard_user" se encuentra en la pagina inventarios
    |url|https://www.saucedemo.com/inventory.html|

    When Ingresa a la lista de articulos

    Then agrega 2 articulos al carrito "exitoso"

