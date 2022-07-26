#Author: juan.martinezs@sophossolutions.com
Feature: Generate Costumer Key

  Scenario Outline: Generate Costumer Key by DataUser
    Given Yo quiero establecer la base url "https://fif-loyalty-ldr-qa.appspot.com/fif/loyalty/v1.0/util/generatehash"
    When envio la informacion del usuario
      | issuingCountry | <pais>            |
      | documentType   | <tipoDocumento>   |
      | documentNumber | <numeroDocumento> |
    Then valido estatus "OK" cuando se genera la key

    Examples: 
      | pais | tipoDocumento | numeroDocumento |
      | CL   |            01 |       176003219 |
      | CL   |            01 |       176003444 |
