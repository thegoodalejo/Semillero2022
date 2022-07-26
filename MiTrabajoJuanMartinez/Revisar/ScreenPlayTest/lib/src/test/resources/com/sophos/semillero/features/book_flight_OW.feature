#Author: Juan Martinez
Feature: BookFlights
  I want to use this template for my feature file

  Scenario: Book Flight
    Given "Juanse" se encuentra en el HomePage
    When realiza una busqueda de vuelo
      | from          | mede       |
      | to            | canc       |
      | departureDate | 29-07-2022 |
      | adults        |          3 |
      | childs        |          2 |
      | infants       |          1 |
    Then encuentra el vuelo mas barato
