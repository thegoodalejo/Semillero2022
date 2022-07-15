import { expect, Page } from "@playwright/test";




export class LoginPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async LogIn(info) {
        //ingresando usuario y contraseña
        // Fill [data-test="username"]
        await this.page.locator('[data-test="username"]').fill(info.user);

        // Fill [data-test="password"]
        await this.page.locator('[data-test="password"]').fill(info.password);

        // Click [data-test="login-button"]
        await this.page.locator('[data-test="login-button"]').click();

        await this.page.goto("https://www.saucedemo.com/inventory.html");
    
    }
}