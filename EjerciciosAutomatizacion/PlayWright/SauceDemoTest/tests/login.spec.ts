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

test('test', async({page})=>{

    const loginPage = new LoginPage(page);

    await loginPage.logIn(data);
    await loginPage.isInventoryPage();

});