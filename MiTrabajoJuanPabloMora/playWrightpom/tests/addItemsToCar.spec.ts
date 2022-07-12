import { test, expect } from '@playwright/test';
import { LoginPage } from '../scr/pagesSauceDemo/LoginPage';
import { ProducstListPage } from '../scr/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../scr/pagesSauceDemo/ShoppingCarPage';




test(`
Given I was in the login page
When I was login in   
Then I saw the message login success`, 
async ({ page }) => {

  const loginPage = new LoginPage(page);
  const productListPage = new ProducstListPage(page);
  const shoppingCarPage = new ShoppingCarPage(page);
  
  await loginPage.navegate();
  await loginPage.logIn();
  await productListPage.addProductToCar();
  await shoppingCarPage.howManyProducts();

});