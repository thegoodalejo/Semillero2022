import { test, expect } from '@playwright/test';
import {RegisterPage} from '../scr/pages/RegisterPage';

test(`
Given I was in the register page
When I was register in   
Then I saw the message register success`, 
async ({ page }) => {

  const registerPage = new RegisterPage(page);


  await registerPage.navegate();
  await registerPage.register();


});