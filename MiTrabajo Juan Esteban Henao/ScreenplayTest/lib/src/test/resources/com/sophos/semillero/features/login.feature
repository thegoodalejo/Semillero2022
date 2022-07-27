#Author: juan.henaor@sophossolutions.com
Feature: Login in Newtours


  Scenario: Login del usuario
    Given El "User" se encuentra en la pagina principal
      | url      | https://demo.guru99.com/test/newtours/ |
      | userName | admin                                  |
      | password |                                   1234 |
    When Ingresa usuario y contrasenia
    Then Visualiza el mensaje de "Login exitoso"
