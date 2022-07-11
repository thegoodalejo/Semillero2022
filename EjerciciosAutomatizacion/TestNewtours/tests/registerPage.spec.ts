import { test, expect } from '@playwright/test';
import { RegisterPage } from '../src/pages/RegisterPage';

test(`
given i was register 
when I enter my personal data
then I saw a successful registration message`
, async ({ page }) => {

    const register = new RegisterPage(page);

    await register.navigate();
    await register.register();
});