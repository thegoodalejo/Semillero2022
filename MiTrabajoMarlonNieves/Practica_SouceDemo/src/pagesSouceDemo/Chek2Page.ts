import {Page, expect} from '@playwright/test';

export class Check2Page {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }
    async finishBuy(){
        //finalizando compra de los productos
        await this.page.locator('[data-test="finish"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-complete.html');

    }
}