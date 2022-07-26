#Author: juan.martinezs@sophossolutions.com
Feature: Get Customer

  Scenario: Get customer by Key
    Given Yo quiero establecer la baseurl "https://34.107.239.151/fif/loyalty/v1.0/cl/customer/"
    When envio la key del usuario "rKNgk4WhYOsGcOHQjY_U_ctGWVN9l50_XJM5uAAw-w0="
    Then valido estatus "OK" y estatuscode 200
