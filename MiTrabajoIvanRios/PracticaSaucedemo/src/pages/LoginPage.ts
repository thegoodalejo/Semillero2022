import {Page, expect} from '@playwright/test';

export class LoginPage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    async navigate(){
        await this.page.goto("/");
    }
    
    async login(userName:string, password:string){
        // Fill [data-test="username"]
        await this.page.locator('[data-test="username"]').fill(userName);
        // Fill [data-test="password"]
        await this.page.locator('[data-test="password"]').fill(password);

        await this.page.locator('[data-test="login-button"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
    }
}