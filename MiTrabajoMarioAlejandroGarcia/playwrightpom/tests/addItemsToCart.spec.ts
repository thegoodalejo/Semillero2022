import { test, expect } from '@playwright/test';
import {LoginSauceDemoPage} from '../src/pagesSauceDemo/LoginSauceDemoPage';
import {ProductListPage} from '../src/pagesSauceDemo/ProductListPage';

test.beforeEach(async({page})=>{
    /* Se crea una instancia de la clase LoginSauceDemo */
    const loginSauceDemoPage = new LoginSauceDemoPage(page);
    /* Se definieron dos variables para almacenar los valores de los campos del formulario del Login
                userName|password
    */
    let userName = 'standard_user';
    let password = 'secret_sauce';

    /* Ejecucion del metodo navegate */
    await loginSauceDemoPage.navegate();
    
    /* Ejecucion del metodo login */
    await loginSauceDemoPage.logIn(userName,password);
});

test(`
Given The user is authenticated
When Add products to cart 
Then View the products added to the cart`
, async ({ page }) => {
    /* Se crea una instancia de la clase ProductListPage */
    const productListPage = new ProductListPage(page);

    /* Ejecucion del metodo addProductToCar */
    await productListPage.addProductToCar();

    /* Ejecucion del metodo isOnCart */
    await productListPage.isOnCart();
});