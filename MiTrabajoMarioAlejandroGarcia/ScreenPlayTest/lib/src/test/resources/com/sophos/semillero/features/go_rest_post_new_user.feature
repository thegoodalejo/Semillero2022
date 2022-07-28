#Author: mario.garciasophossolutions.com
Feature: Service Go Rest

  Scenario: Crear un usuario a traves de una peticion POST
    Given quiero establecer la base URL 'https://gorest.co.in/'
    When enviamos la informacion del usuario al endpoint '/public/v2/users'
      | name   | Mario                            |
      | email  | mario.garcia@sophossolutions.com |
      | gender | male                             |
      | status | active                           |
    Then vemos que el status code es 201
