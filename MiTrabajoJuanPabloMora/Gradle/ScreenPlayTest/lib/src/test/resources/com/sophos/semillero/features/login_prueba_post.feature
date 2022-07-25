#Author: juan.morap@sophossolutions.com

Feature: Service test login


  Scenario: prueba login api juan 
    Given quiero establecer la base url en login prueba 'https://login-travel.herokuapp.com'
    When enviamos las credenciales al endpoint '/login'
    | cedula   | 123 |
    | pass  | 1234 |
    Then vemos que el login es exitoso 200
