#Author: juan.morap@´sophossolutions.com

Feature: Get post all


  Scenario: consultar un post a traves de una peticion GET
    Given quiero establecer la base url en jsonplaceholder para el get 'https://jsonplaceholder.typicode.com'
    When enviamos la peticion del post al endpoint '/posts/', por id '50'
    Then vemos que el status code es 200 



