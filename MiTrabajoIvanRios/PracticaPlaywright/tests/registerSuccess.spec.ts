import { test, expect } from '@playwright/test';
import { RegisterPage } from '../src/pages/registerPage';

test(`
Given I was in the Register Page
When I was Registered 
Then I saw the message Thank you for registering`,
async ({ page }) => {
  const registerPage = new RegisterPage(page);
  await registerPage.navigate();
  await registerPage.register();
  await registerPage.redirect();
});




