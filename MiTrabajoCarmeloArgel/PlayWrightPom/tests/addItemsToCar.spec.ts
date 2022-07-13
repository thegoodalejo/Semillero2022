import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSauceDemo/LoginPage';
import { ProductListPage } from '../src/pagesSauceDemo/ProductListPage';
import { ShoppingCarPage } from '../src/pagesSauceDemo/ShoppingCarPage';

test(`
Given I was must have correct account in login page
When I was add two products at the shopping car
Then I saw two products at the car list`,
async ({ page }) => {

    const loginPage = new LoginPage(page);
    const productListPage = new ProductListPage(page);
    const shoopingCarPage = new ShoppingCarPage(page);
    
    await loginPage.navegate();
    await loginPage.logIn();
    await productListPage.addProductsToCar();
    expect(await shoopingCarPage.howManyProducts());
    
});