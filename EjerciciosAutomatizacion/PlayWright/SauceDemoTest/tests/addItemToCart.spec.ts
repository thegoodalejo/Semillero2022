import {test} from '@playwright/test';
import { InventoryPage } from '../src/pages/InventoryPage';
import { LoginPage } from '../src/pages/LoginPage';

/**datos para hacer el login */
const data = {
    user : 'standard_user',
    pass : 'secret_sauce'
}
/******************************** */

/**Productos para agregar al carrito */
const products = [
    "Sauce Labs Backpack",
    "Sauce Labs Onesie"
];
/******************************** */

test.beforeEach(async ({page})=>{

    await page.goto('https://www.saucedemo.com/');

});

test(`
Given the user was on the inventory page
when adding products to the cart
then he saw that the products were added to the cart.
`, async({page})=>{

    const loginPage = new LoginPage(page);
    const inventoryPage = new InventoryPage(page);

    /**Login */
    await loginPage.logIn(data);
    await loginPage.isInventoryPage();
    /************************************* */

    /**Agregando productos la carrito */
    await inventoryPage.addItemToCart(products);
    /************************************* */

});

