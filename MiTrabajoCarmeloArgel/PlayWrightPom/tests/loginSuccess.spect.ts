import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';

test(`
Given I was in the login page
When I was login in
Then I saw the mesaage login success`,
async ({ page }) => {

    const loginPage = new LoginPage(page);

    await loginPage.navegate();
    await loginPage.logIn();

});