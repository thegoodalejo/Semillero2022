import { test} from '@playwright/test';
import { LoginPage } from '../src/pagesNewTours/LoginPage';


test(`
Given I was in the login page
When I was login in 
Then I saw the message login success`
, async ({ page }) => {
  const loginPage = new LoginPage(page);
  await loginPage.navegate();
  await loginPage.logIn('admin','123456');
  await loginPage.isLogIn();
});