import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSauceDemo/LoginPage';
import { ProductListPage } from '../src/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../src/pagesSauceDemo/ShoppingCarPage';

test.beforeEach(async ({ page }) => {
    //Variables globales para ambas pruebas
    let username = "standard_user";
    let password = "secret_sauce";
    await page.goto('https://www.saucedemo.com/');
    const loginPage = new LoginPage(page);
    await loginPage.logIn(username, password);
});



test(`
Given I was in the saucedemo.com
when I want to filter products from lowest to highest  
Then To add to the cart the product of lower and higher value`,
async ({ page }) => {
    // let username = "standard_user";
    //  let password = "secret_sauce";


    //inilización de las paginas 
    
    const productListPage = new ProductListPage(page);


    //ejecución de las pruebas
    
    await productListPage.filterProducts();
    await productListPage.chooseProducts();
});

test(`
Given I was in the saucedemo.com
when I want to check-in with 3 products added to the cart
Then To finalize the purchase and see the message THANK YOU FOR YOUR ORDER`,
async ({ page }) => {

    //variables para la prueba
    //let username = "standard_user";
    //let password = "secret_sauce";
    let firstName = "Juan";
    let lastName = "Henao";
    let postalCode = "630001";

    //inilización de las paginas 
    const productListPage = new ProductListPage(page);
    const shoopingCarPage = new ShoppingCarPage(page);


    //ejecución de las pruebas

    await productListPage.addProductsToCar();
    await shoopingCarPage.factura(firstName, lastName, postalCode);
    await shoopingCarPage.validateMessage();
    
});