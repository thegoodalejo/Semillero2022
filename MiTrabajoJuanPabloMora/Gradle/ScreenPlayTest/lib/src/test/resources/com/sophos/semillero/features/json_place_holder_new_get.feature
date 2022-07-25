#Author: juan.morap@´sophossolutions.com
Feature: Get post all

  Scenario Outline: consultar un post a traves de una peticion GET
    Given quiero establecer la base url en jsonplaceholder para el get '<Url>'
    When enviamos la peticion del post al endpoint '<endpoint>', por id '<id>'
    Then vemos que el status code es <code>

    Examples: 
      | id  | code | Url                                  | endpoint |
      |  50 |  200 | https://jsonplaceholder.typicode.com | /posts/  |
      | 501 |  404 | https://jsonplaceholder.typicode.com | /posts/  |
