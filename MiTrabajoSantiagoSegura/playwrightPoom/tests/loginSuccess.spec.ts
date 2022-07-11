import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/LoginPage';

test(`Given I was in the login page
      When I was 
      Then I saw the message login success`, async ({ page }) => {

 const LoginPage1= new LoginPage(page);
       LoginPage1.navegate();
       LoginPage1.logIn();
       
});
