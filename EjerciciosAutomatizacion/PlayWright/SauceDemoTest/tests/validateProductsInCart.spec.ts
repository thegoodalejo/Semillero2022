import {test} from '@playwright/test';
import { CartPage } from '../src/pages/CartPage';
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
    "Sauce Labs Onesie",
    "Sauce Labs Fleece Jacket"
];

test.beforeEach(async ({page})=>{

    const loginPage = new LoginPage(page);

    await page.goto('https://www.saucedemo.com/');
    
    /**Login */
    await loginPage.logIn(data);
    await loginPage.isInventoryPage();
    /************************************* */

});

test(`
Given the user added n products to the cart
when entering the cart
then he saw n products added to the cart
`, async({page})=>{

    const inventoryPage = new InventoryPage(page);
    const cartPage = new CartPage(page);

    /**Agregando productos la carrito */
    await inventoryPage.addItemToCart(products);
    /************************************* */

    /**Validando la cantidad de productos */
    await cartPage.navigateToCartPage();
    await cartPage.isInCartPage();

    await cartPage.validateProductsInCart(products.length);
    /************************************* */

});