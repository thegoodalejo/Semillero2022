import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSouceDemo/LoginPage';
import { AddToCardPage } from '../src/pagesSouceDemo/AddToCar';
import { CheckPage } from '../src/pagesSouceDemo/CheckPage';
import {Check2Page } from '../src/pagesSouceDemo/Chek2Page';


const info = {
    user: 'standard_user',
    password: 'secret_sauce'
};

const information = {
    firstName: 'Marlon',
    lastName: 'Nieves',
    code: '+57'
};


/* let products = [
    "Sauce Labs Backpack",
    "Sauce Labs Bolt T-Shirt"
]; */

test(`
Given the user was logged successfull
When the user add item to card
Then the user saw the item in the car`,

    async ({ page }) => {
        const loginPage = new LoginPage(page);
        const addToCardPage = new AddToCardPage(page);
        const checkPage = new CheckPage(page);
        const check2Page = new Check2Page(page);
      

        await loginPage.LogIn(info);
        await addToCardPage.addProductToCar();
        await checkPage.infoUserData(information);
        await check2Page.finishBuy();
      

    });


test.beforeEach(async ({ page }) => {
    page.goto('https://www.saucedemo.com/');
});

