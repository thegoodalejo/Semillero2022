#Author: your.email@your.domain.com
Feature: Get user by id

  Scenario: Consultar un usuario a traves de una peticion Get
    Given quiero establecer la base url "https://gorest.co.in/"
    When enviamos la info del usuario por "public/v2/users/" por id "6280"
    Then validaremos estatus code 200 y que contenga el nombre "juans"
