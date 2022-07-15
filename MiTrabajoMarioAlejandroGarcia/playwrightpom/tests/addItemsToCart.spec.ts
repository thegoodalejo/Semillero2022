import { test, expect } from '@playwright/test';
import {LoginSauceDemoPage} from '../src/pagesSauceDemo/LoginSauceDemoPage';
import {ProductListPage} from '../src/pagesSauceDemo/ProductListPage';

test(`
Given The user is authenticated
When Add products to cart 
Then View the products added to the cart`
, async ({ page }) => {

    const loginSauceDemoPage = new LoginSauceDemoPage(page);
    const productListPage = new ProductListPage(page);

    let username = 'standard_user';
    let password = 'secret_sauce';

    await loginSauceDemoPage.navegate();
    await loginSauceDemoPage.logIn(username,password);
    await productListPage.addProductToCar();
    await productListPage.isOnCartPage();
});