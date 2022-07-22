#Author: your.email@your.domain.com
Feature: Service go rest

  Scenario: crear un usuario a traves de una peticion POST
    Given quiero establecer la base url "https://gorest.co.in/"
    When enviamos la informacion del usuario al endpoint "/public/v2/users"
      | name   | marlon           |
      | email  | marlon@gmail.com |
      | gender | male             |
      | status | active           |
    Then vemos que el status code es 200
