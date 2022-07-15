#Author: juan.morap@sophossolutioins.com

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Login
    Given "Juan" se encuentra en la pagina principal
    |url|https://demo.guru99.com/test/newtours/|
    |username|juan|
    |password|1234|

    When Ingresa usuario y contrasena

    Then visualiza el mensaje de "Login exitoso"


  