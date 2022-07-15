import {Page, expect} from '@playwright/test';

export class CheckoutComplete{

    readonly page : Page;

    constructor(page : Page){
        this.page = page;
    }

    async isInCheckoutComplete(){

        await expect(this.page.locator("xpath=//h2[@class= 'complete-header']")).toBeVisible();

    }
}