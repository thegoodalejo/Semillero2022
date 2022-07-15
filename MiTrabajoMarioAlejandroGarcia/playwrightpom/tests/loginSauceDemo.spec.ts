import { test} from '@playwright/test';
import { LoginSauceDemoPage } from '../src/pagesSauceDemo/LoginSauceDemoPage';


test(`
Given The user is on the main page of SauceDemo
When Enter your credentials 
Then You are redirected to the Product Inventory page`
, async ({ page }) => {
  const loginSauceDemoPage = new LoginSauceDemoPage(page);

  let username = 'standard_user';
  let password = 'secret_sauce';

  await loginSauceDemoPage.navegate();
  await loginSauceDemoPage.logIn(username, password);
});