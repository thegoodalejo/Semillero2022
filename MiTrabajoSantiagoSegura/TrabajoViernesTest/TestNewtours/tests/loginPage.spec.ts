import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';

test(`
given i was login
when i was enter my username and password
then i saw a succesfully loggin message`
, async ({ page }) => {

    const login = new LoginPage(page);
    
    await login.navigate();
 

});