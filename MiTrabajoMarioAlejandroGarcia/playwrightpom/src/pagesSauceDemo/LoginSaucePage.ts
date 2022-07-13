import { Page, expect } from "@playwright/test";


export class LoginSaucePage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async logIn(userName:string, password:string){
        const txtuserName = this.page.locator('[data-test="username"]');
        const txtpassword = this.page.locator('[data-test="password"]');
        // Fill [data-test="username"]
        await txtuserName.fill(userName);
        // Fill [data-test="password"]
        await txtpassword.fill(password);

        const somevalue = this.page.inputValue('[data-test="username"]');
        console.log(somevalue);
        const somevalue1 = this.page.inputValue('[data-test="login-button"]');
        console.log(somevalue1);
        // Click [data-test="login-button"]
        await this.page.locator('[data-test="login-button"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
  
    }
    async navegate(){
        // Go to https://www.saucedemo.com/
        await this.page.goto('https://www.saucedemo.com/');
    }
}