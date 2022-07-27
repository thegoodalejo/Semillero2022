#Author: your.email@your.domain.com
Feature: Service get user by id

  Scenario: Consultar un usuario a traves de un Get
    Given quiero establecer la url base "https://gorest.co.in/"
    When enviamos la informacion del usuario al endpoint "/public/v2/users/", por id "6179"
    Then vemos que el status code es 200 y que contenga el nombre "Juan"