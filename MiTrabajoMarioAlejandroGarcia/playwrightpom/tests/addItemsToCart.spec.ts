import { test, expect } from '@playwright/test';
import {LoginSaucePage} from '../src/pagesSauceDemo/LoginSaucePage';
import {ProductListPage} from '../src/pagesSauceDemo/ProductListPage';
import {ShoppingCartPage} from '../src/pagesSauceDemo/ShoppingCartPage';

test('test', async ({ page }) => {

    const loginSaucePage = new LoginSaucePage(page);
    const productListPage = new ProductListPage(page);
    const shoppingCartPage = new ShoppingCartPage(page);

    await loginSaucePage.navegate();
    await loginSaucePage.logIn('standard_user','secret_sauce');
    await productListPage.addProductToCar();
    await shoppingCartPage.howManyProducts();
});