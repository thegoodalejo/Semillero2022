#Author: mario.garciasophossolutions.com

Feature: Get user by id

  Scenario: consultar un usuario a traves de una peticion GET
    Given quiero establecer la base URL 'https://gorest.co.in/'
    When enviamos la informacion del usuario al endpoint 'public/v2/users/' por id "4876"
    Then vemos que el status code es 200 y que contenga el nombre "Mario"
