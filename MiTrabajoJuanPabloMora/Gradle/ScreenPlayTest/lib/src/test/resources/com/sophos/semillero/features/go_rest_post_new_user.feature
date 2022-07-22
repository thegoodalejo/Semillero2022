#Author: your.email@your.domain.com


Feature: Service go rest

  Scenario: crear un usuario a traves de una peticion
    Given quiero establecer la base url 'https://gorest.co.in/'
    When enviamos la informacion del usuario al endpoint '/public/v2/users'
    | name   | john |
    | email  | john@gmail.com |
    | gender | male |
    | status | active |
    Then vemos que el status code es 200


