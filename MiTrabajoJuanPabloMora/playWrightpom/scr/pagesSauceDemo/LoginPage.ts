import { expect, Page } from "@playwright/test";


export class LoginPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async logIn(){

    // Fill [data-test="username"]
    await this.page.locator('[data-test="username"]').fill('standard_user');

    // Fill [data-test="password"]
    await this.page.locator('[data-test="password"]').fill('secret_sauce');

    // Press Enter
    await this.page.locator('[data-test="password"]').press('Enter');
    await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
  

    }

    async navegate(){
          // Go to https://www.saucedemo.com/
          await this.page.goto('https://www.saucedemo.com/')

    }

    }
