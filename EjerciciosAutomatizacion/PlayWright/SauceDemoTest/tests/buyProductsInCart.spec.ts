import {test} from '@playwright/test';
import { CartPage } from '../src/pages/CartPage';
import { InventoryPage } from '../src/pages/InventoryPage';
import { CheckoutOnePage } from '../src/pages/CheckoutOnePage';
import { CheckoutSecondPage } from '../src/pages/CheckoutSecondPage';
import { CheckoutComplete } from '../src/pages/CheckoutComplete';
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
/******************************** */

const info = {
    name : 'Jhon',
    lastName : 'Doe',
    zipCode : '71000'
}

test.beforeEach(async ({page})=>{

    const loginPage = new LoginPage(page);

    page.goto('https://www.saucedemo.com/');
    
    /**Login */
    await loginPage.logIn(data);
    await loginPage.isInventoryPage();
    /************************************* */

});

test(`
Given the user has products in the cart
when he purchased the products
then he saw that the purchase was successful.
`, async({page})=>{

    const inventoryPage = new InventoryPage(page);
    const cartPage = new CartPage(page);
    const checkoutOnePage = new CheckoutOnePage(page);
    const checkoutSecondPage = new CheckoutSecondPage(page);
    const checkoutComplete = new CheckoutComplete(page);

    /**Agregando productos la carrito */
    await inventoryPage.addItemToCart(products);
    /************************************* */

    /**Accediendo al cart page */
    await cartPage.navigateToCartPage();
    await cartPage.isInCartPage();
    await cartPage.buyProducts();
    /************************************* */

    /**entrando al primer checkout - formulario de compra */
    await checkoutOnePage.isInCheckoutOnePage();
    await checkoutOnePage.fillForm(info);
    await checkoutOnePage.clickBtnContinue();
    /**************************************** */

    /**entrando al segundo checkout - factura*/
    await checkoutSecondPage.isInCheckoutSecondPage();
    await checkoutSecondPage.clickBtnFinish();
    /**************************************** */

    /**Pagina final de compra */
    await checkoutComplete.isInCheckoutComplete();
    /**************************************** */

});