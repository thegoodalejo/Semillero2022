#Author: mario.garcia@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Busqueda Tours en PhpTravels
    Given "Mario" se encuentra en la pagina principal de PhpTravels
    When Ingresa parametros de busqueda
      | city      | Medellin   |
      | day       |         20 |
      | date      | 20-07-2022 |
      | cantAdult |          5 |
      | cantChild |          4 |
    Then Se redirige a la pagina de Busqueda de Tours
