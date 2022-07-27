#Author: your.email@your.domain.com
Feature: Service go rest

  Scenario: Crear un usuario a traves de un POST
    Given quiero establecer la url base "https://gorest.co.in/"
    When enviamos la informacion del usuario al endpoint "/public/v2/users"
      | name   | Juan                   |
      | email  | juan12345432@gmail.com |
      | gender | male                   |
      | status | active                 |
    Then vemos que el status code es 200
