import { expect, Page } from "@playwright/test";




export class LoginPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async LogIn(userName: string, password: string) {
        const txtuserName = this.page.locator('input[name="userName"]');
        //const txtpassword = 'input[name="userName"]';

        // Fill input[name="userName"]
        await txtuserName.fill(userName);

        // Fill input[name="password"]
        //await this.page.locator.fill(txtpassword, password);
        await this.page.locator('input[name="password"]').fill(password);

        // Click text=Submit
        await this.page.locator('text=Submit').click();
    }

    async navigate() {
        // Go to https://demo.guru99.com/test/newtours/
        await this.page.goto('https://demo.guru99.com/test/newtours/');

    }
    async isLogIn() {
        await expect(this.page.locator('text=Login Successfully'), 'should be loggen in').toBeVisible();
    }
}