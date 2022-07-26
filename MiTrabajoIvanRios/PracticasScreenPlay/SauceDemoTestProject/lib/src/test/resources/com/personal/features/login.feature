#Author: ivan.riosa@sophossolutions.com

@tag
Feature: Login Successful
  

  @tag1
  Scenario: Login Successful
    Given "Ivan" esta en la pagina principal
    	|url|https://www.saucedemo.com|
    When diligencie el formulario del login
    	|username|standard_user|
    	|password|secret_sauce | 
    Then es dirigido hacia la pagina de inventario

	@tag2
	Scenario: Login Blocked
  	Given "Ivan" esta en la pagina principal
    	|url|https://www.saucedemo.com|
    When diligencie el formulario del login
    	|username|locked_out_user|
    	|password|secret_sauce | 
    Then se visualiza mensaje "Epic sadface: Sorry, this user has been locked out."
  	