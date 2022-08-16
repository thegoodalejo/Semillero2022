#Author: juan.henaor@sophossolutions.com
Feature: Search flight

  Scenario Outline: Search flight in Omio
    Given Me as a user
    When I want to search for a flight on page "https://omio.es"
      | salida        | <salida>        |
      | llegada       | <llegada>       |
      | fecha_salida  | <fecha_salida>  |
      | fecha_regreso | <fecha_regreso> |
      | adultos       | <adultos>       |
      | jovenes       | <jovenes>       |
      | edad_jovenes  | <edad_jovenes>  |
      | viejos        | <viejos>        |
      | edad_viejos   | <edad_viejos>   |
    Then To find one according to my needs
      | aerolinea | <aerolinea> |

    Examples: 
      | salida                      | llegada        | fecha_salida | fecha_regreso | adultos | jovenes | edad_jovenes | viejos | edad_viejos | aerolinea  |
      | Santafe de Bogotá, Colombia | Madrid, España | Mon Aug 08   |             0 |       2 |       2 | 4-6          |      0 |             | AeroMexico |
      | Medellín                    | París, Francia | Tue Aug 09   | Wed Aug 17    |       1 |       1 |            4 |      1 |          60 | AirEuropa  |
