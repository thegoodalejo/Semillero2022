import {Page, expect} from '@playwright/test';

export class CardPage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    async finishBuy(){
        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');
    }
}