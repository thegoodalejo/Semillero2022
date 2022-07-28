#Author: mario.garciasophossolutions.com
Feature: Service JSONPlaceholder

  Scenario: Crear un nuevo post a partir de una peticion POST
    Given quiero establecer la base URL de jsonplaceholder 'https://jsonplaceholder.typicode.com'
    When enviamos la informacion del post al endpoint '/posts'
      | userId |                        12 |
      | id     |                       110 |
      | title  | post prueba               |
      | body   | Este es un post de prueba |
    Then vemos que el status code del nuevo post es 201
