import {test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSouceDemo/LoginPage';


test(`
Given the user was logged successfull
When the user add item to card
Then the user saw the item in the car`,

async ({ page }) =>{
    const loginPage = new LoginPage(page);

    await loginPage.navigate();
    await loginPage.LogIn();

});