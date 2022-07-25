#Author: juan.morap@sophossolutions.com

Feature: Service JSONPlaceholder


  Scenario: crear un nuevo post 
    Given quiero establecer la base url en jsonplaceholder 'https://jsonplaceholder.typicode.com'
    When enviamos la informacion del post al endpoint '/posts'
    | userId   | 10 |
    | id  | 1 |
    | title | prueba 1 |
    | body | Hola Mundo desde el semillero sophos 2022 |
    Then vemos que el status code del nuevo post es 201