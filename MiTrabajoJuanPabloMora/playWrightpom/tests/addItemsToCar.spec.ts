import { test, expect } from '@playwright/test';
import { LoginPage } from '../scr/pagesSauceDemo/LoginPage';
import { ProducstListPage } from '../scr/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../scr/pagesSauceDemo/ShoppingCarPage';


test(`
Given el usuario lista los productos
When Selecciono los dos productos  
Then los productos se agrega al carrito 
And Se finaliza la compra`, 

async ({ page }) => {

  //Objetos
  const loginPage = new LoginPage(page);
  const productListPage = new ProducstListPage(page);
  const shoppingCarPage = new ShoppingCarPage(page);
  
  //credenciales de usuario
  const user = 'standard_user';
  const password = 'secret_sauce';

  //Datos de Usuario
  const firstName = 'Juan';
  const lastName = 'Mora';
  const postalCode = '12345';

  //metodo navegar
  await loginPage.navegate();
  //metodo para iniciar sesion 
  await loginPage.logIn(user, password);
  //Metodo Agregar productos 
  await productListPage.addProductToCar();
  //Verificar productos
  await shoppingCarPage.howManyProducts();
  //LLenar datos de usuario para facturar 
  await shoppingCarPage.InformationUser(firstName,lastName,postalCode);
  //Finalizar compra
  await shoppingCarPage.finalizeBuy();

});