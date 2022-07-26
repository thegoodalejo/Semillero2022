#Author: your.email@your.domain.com
Feature: Service go rest

  Scenario: Crear un usuario a través de una petición POST
    Given quiero establecer la base url "https://gorest.co.in/"
    When enviamos la info del usuario por "public/v2/users"
      | name   | juan                   |
      | email  | juanse658i@hotmail.com |
      | gender | male                   |
      | status | active                 |
    Then validaremos estus code 200
