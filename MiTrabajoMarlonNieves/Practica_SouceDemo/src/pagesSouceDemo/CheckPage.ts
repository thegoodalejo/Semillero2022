import { Page, expect } from '@playwright/test';

export class CheckPage {
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async infoUserData(information) {
        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');


        //validando informacion CHECKOUT: YOUR INFORMATION
        // Click [data-test="firstName"]
        await this.page.locator('[data-test="firstName"]').click();
        // Fill [data-test="firstName"]
        await this.page.locator('[data-test="firstName"]').fill(information.firstName);
        // Click [data-test="lastName"]
        await this.page.locator('[data-test="lastName"]').click();
        // Fill [data-test="lastName"]
        await this.page.locator('[data-test="lastName"]').fill(information.lastName);
        // Click [data-test="postalCode"]
        await this.page.locator('[data-test="postalCode"]').click();
        // Fill [data-test="postalCode"]
        await this.page.locator('[data-test="postalCode"]').fill(information.code);
        // Fill [data-test="postalCode"]
        await this.page.locator('[data-test="continue"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-two.html');
    }
    
}