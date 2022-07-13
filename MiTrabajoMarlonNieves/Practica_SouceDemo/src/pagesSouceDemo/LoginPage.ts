import { expect, Page } from "@playwright/test";




export class LoginPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async LogIn() {
        // Fill [data-test="username"]
        await this.page.locator('[data-test="username"]').fill('standard_user');

        // Fill [data-test="password"]
        await this.page.locator('[data-test="password"]').fill('secret_sauce');

        // Click [data-test="login-button"]
        await this.page.locator('[data-test="login-button"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
    }

    async navigate() {
        // Go to https://www.saucedemo.com/
        await this.page.goto('https://www.saucedemo.com/');

    }

}