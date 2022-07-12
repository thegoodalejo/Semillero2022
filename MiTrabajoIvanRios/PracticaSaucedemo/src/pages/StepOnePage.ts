import {Page, expect} from '@playwright/test';

export class StepOnePage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    async fillUserData(){
       
        await this.page.locator('[data-test="firstName"]').fill('Ivan');
        await this.page.locator('[data-test="lastName"]').fill('Rios');
        await this.page.locator('[data-test="postalCode"]').fill('50001');
        await this.page.locator('[data-test="continue"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-two.html');
    }
}