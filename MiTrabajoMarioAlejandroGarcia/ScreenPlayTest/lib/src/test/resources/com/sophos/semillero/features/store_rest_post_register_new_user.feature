#Author: mario.garcia@sophossolutions.com
Feature: Service StoreRestApi

  Scenario: Registrar un nuevo usuario a traves de una peticion POST
    Given Quiero establecer la base URL de StoreRestApi 'https://storerestapi.com'
    When Enviamos la informacion del usuario al endpoint '/users'
      | name           | Mario Garcia           |
      | email          | marioagc7050@gmail.com |
      | number         |             3155390107 |
      | password       |                 123456 |
      | passwordrepeat |                 123456 |
    Then Visualizamos que el status code es 201
