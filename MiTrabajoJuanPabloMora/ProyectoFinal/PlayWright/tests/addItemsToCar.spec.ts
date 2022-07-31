import { test, expect } from '@playwright/test';
import { LoginPage } from '../scr/pagesSauceDemo/LoginPage';
import { ProducstListPage } from '../scr/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../scr/pagesSauceDemo/ShoppingCarPage';

test.beforeEach(async({page}) =>{

  const loginPage = new LoginPage(page);
  //credenciales de usuario
  const strUser = 'standard_user';
  const strPassword = 'secret_sauce';

  //metodo navegar
  await loginPage.navegate();
  //metodo para iniciar sesion 
  await loginPage.logIn(strUser, strPassword);

}); 



test(`
Given El usuario debe estar en la pagina saucedemo.com 
And debe estar autenticado 
When Quiero hacer check-in con 3 productos agregados el carrito
Then  finalizar la compra y ver el mensaje THANK YOU FOR YOUR ORDER`, 

async ({ page }) => {

  //Objetos
  
  const productListPage = new ProducstListPage(page);
  const shoppingCarPage = new ShoppingCarPage(page);
  


  //Datos de Usuario
  const strfirstName = 'Juan';
  const strlastName = 'Mora';
  const strpostalCode = '12345';


  //Metodo Agregar productos 
  await productListPage.addProductToCar();
  //Verificar productos
  await shoppingCarPage.howManyProducts();
  //LLenar datos de usuario para facturar 
  await shoppingCarPage.InformationUser(strfirstName,strlastName,strpostalCode);
  //Finalizar compra
  await shoppingCarPage.finalizeBuy();

});