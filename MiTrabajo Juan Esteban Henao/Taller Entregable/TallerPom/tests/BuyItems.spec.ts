import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSauceDemo/LoginPage';
import { ProductListPage } from '../src/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../src/pagesSauceDemo/ShoppingCarPage';

test(`
Given the user was must have correct account in login page
When the user was add two products at the shopping car
Then was the user can get an invoice`,
async ({ page }) => {

    //variables para la prueba
    let username = "standard_user";
    let password = "secret_sauce";
    let firstName = "Juan";
    let lastName = "Henao";
    let postalCode = "630001";

    //inilización de las paginas 
    const loginPage = new LoginPage(page);
    const productListPage = new ProductListPage(page);
    const shoopingCarPage = new ShoppingCarPage(page);


    //ejecución de las pruebas
    await loginPage.navegate();
    await loginPage.logIn(username, password);
    await productListPage.addProductsToCar();
    expect(shoopingCarPage.howManyProducts());
    await shoopingCarPage.factura(firstName, lastName, postalCode);
    
});