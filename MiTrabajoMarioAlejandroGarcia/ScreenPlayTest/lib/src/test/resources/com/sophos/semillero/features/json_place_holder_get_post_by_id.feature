#Author: mario.garciasophossolutions.com
Feature: Service JSONPlaceholder

  Scenario Outline: Consultar un post a partir de una peticion GET
    Given quiero establecer la base URL de jsonplaceholder '<url>'
    When enviamos la informacion del post al endpoint '<endpoint>' por id '<id>'
    Then vemos que el status code del post consultado es <code>

    Examples: 
      | id  | code | url                                  | endpoint |
      |  21 |  200 | https://jsonplaceholder.typicode.com | /posts/  |
      | 110 |  404 | https://jsonplaceholder.typicode.com | /posts/  |
