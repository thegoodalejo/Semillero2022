import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';

test(`
Given I was in the login Page
When I was login in
Then I saw the message login succesfull`,
async ({ page }) => {
  const loginPage = new LoginPage(page);
  await loginPage.navigate();
  await loginPage.LogIn();
});