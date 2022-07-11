import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/LoginPages';

test(`
  Give I was in the login page
  When I was login
  Then I saw the message Login Success`, 
  async ({ page }) => {
    const loginPage = new LoginPage(page);
    await loginPage.navigate();
    await loginPage.logIn();
});