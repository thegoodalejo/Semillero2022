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

test('test', async({page})=>{

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

