import {test} from '@playwright/test';
import { InventoryPage } from '../src/pages/InventoryPage';
import { LoginPage } from '../src/pages/LoginPage';

/**Datos para hacer el login */
const data = {
    user : 'standard_user',
    pass : 'secret_sauce'
}

test.beforeEach(async ({page})=>{

    await page.goto('https://www.saucedemo.com/');
});

test(`
Given the user is on the login page 
when he/she enters the credentials
then he/she login to the inventory page
`, async({page})=>{

    const loginPage = new LoginPage(page);

    await loginPage.logIn(data);
    await loginPage.isInventoryPage();

});