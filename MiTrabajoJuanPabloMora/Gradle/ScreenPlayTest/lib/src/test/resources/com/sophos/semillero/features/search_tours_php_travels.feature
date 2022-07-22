#Author: juan.morap@sophossolutions.com
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Busqueda Tours en PhpTravels
    Given "Mario" se encuentra en la pagina principal de PhpTravels
      |url|https://www.phptravels.net/|
      | city      | Medellin   |
      | day       |         25 |
      | date      | 25-07-2022 |
      | cantAdult |          5 |
      | cantChild |          4 |
    When Ingresa parametros de busqueda

    Then Se redirige a la pagina de Busqueda de Tours