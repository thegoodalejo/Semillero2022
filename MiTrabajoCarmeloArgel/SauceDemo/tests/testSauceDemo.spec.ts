import {test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';
import { AddProducts } from '../src/pages/AddProductsToCar';
import { BuyProducts } from '../src/pages/BuyProducts';

test(`
Given the user was logged successfull
When the user add item to card
Then the user saw the item in the car`,

async ({ page }) =>{

    // Login
    let userName = "standard_user";
    let password = "secret_sauce";
    // Checkout Información
    let firstName = "Carmelo";
    let lastName = "Argel";
    let codePostal = "230001";

    // Objetos de cada Clase
    const loginPage = new LoginPage(page);
    const addProductsCar = new AddProducts(page);
    const buyProducts = new BuyProducts(page);

    // Llamamos cada metodo a traves del objeto
    await loginPage.navigate();
    await loginPage.login(userName, password);
    await addProductsCar.addProductsCar();
    await buyProducts.listProducts();
    await buyProducts.checkoutInformation(firstName, lastName, codePostal);
    await buyProducts.checkoutOverview();

});