#Author: your.email@your.domain.com

Feature: Loguin 
  I want to use this template for my feature file
  Scenario: Validar usuario 
    Given "SANTIAGO" esta en la pagina de login
    |url                   | https://www.saucedemo.com/|
    |userName              |standard_user              | 
    |password              |secret_sauce               |
    When validara el usuario 
    And y su clave
    Then entrara a la pagina de vuelos 
    

