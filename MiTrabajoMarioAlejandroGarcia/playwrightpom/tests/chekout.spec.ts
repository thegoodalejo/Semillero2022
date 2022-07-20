import { test, expect } from '@playwright/test';
import {LoginSauceDemoPage} from '../src/pagesSauceDemo/LoginSauceDemoPage';
import {ProductListPage} from '../src/pagesSauceDemo/ProductListPage';
import {ShoppingCartPage} from '../src/pagesSauceDemo/ShoppingCartPage';

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
Given The user has added products to the cart
When Finalize the purchase of the products 
Then View the purchase invoice
And View the purchase confirmation`
, async ({ page }) => {
    /* Se crean una instancia para las clase:
            ProductListPage 
            ShoppingCartPage        
    */
    const productListPage = new ProductListPage(page);
    const shoppingCartPage = new ShoppingCartPage(page);
    /* Se definieron dos variables para almacenar los valores del formulario de informacion del cliente
                firstname|lastnaem|codepostal    */
    let firtName = 'Mario';
    let lastName = 'Garcia';
    let codePostal = '190003';

    /* Ejecucion del metodo addProductToCar */
    await productListPage.addProductToCar();
    /* Ejecucion del metodo isOnCart */
    await productListPage.isOnCart();
    /* Ejecucion del metodo checkoutOneStep */
    await shoppingCartPage.checkoutOneStep(firtName, lastName, codePostal);
    /* Ejecucion del metodo isOnCheckoutOverview */
    await shoppingCartPage.isOnCheckoutOverview();
    /* Ejecucion del metodo confirmPurchase */
    await shoppingCartPage.confirmPurchase();
    /* Ejecucion del metodo isOnCheckoutComplete */
    await shoppingCartPage.isOnCheckoutComplete();
});

