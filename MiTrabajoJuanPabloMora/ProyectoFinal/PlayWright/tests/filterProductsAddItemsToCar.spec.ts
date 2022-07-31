 import { test } from '@playwright/test';
import { LoginPage } from '../scr/pagesSauceDemo/LoginPage';
import { FilterProducstListPage } from '../scr/pagesSauceDemo/FilterProductListPage';


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
When Quiero filtrar los productos de menor a mayor en la página saucedemo.com
Then  Para agregar al carrito el producto de menor y mayor valor`, 

async ({ page }) => {
  //Objetos
  const fillterProductListPage = new FilterProducstListPage(page);
  
  //Metodo Filtrar productos 
  await fillterProductListPage.filterProduct();
  //Metodo Agregar productos 
  await fillterProductListPage.addProduct();
  //Verificar productos
  await fillterProductListPage.howManyProducts();


});