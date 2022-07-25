#Author: juan.morap@´sophossolutions.com

Feature: Get user by id


  Scenario: consultar un usuario a traves de una peticion GET
    Given quiero establecer la base url 'https://gorest.co.in/'
    When enviamos la informacion del usuario al endpoint '/public/v2/users/', por id "6498"
    Then vemos que el status code es 200 y que contenga el nombre 'john'


