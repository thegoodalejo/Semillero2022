import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';

const userName = "standard_user";
const password = "secret_sauce";

test(`
    Give I was logged in SauceDemo
    When I fill the fields
    Then I saw the inventory
        `, async ({ page }) => {
            const loginPage = new LoginPage(page);
           
            await loginPage.navigate();
            await loginPage.login(userName,password);
            
    
});