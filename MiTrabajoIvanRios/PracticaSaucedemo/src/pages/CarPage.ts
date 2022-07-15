import {Page, expect} from '@playwright/test';
let url = 'https://www.saucedemo.com/checkout-step-one.html';
export class CarPage {
    readonly page: Page;
    
    
    constructor(page:Page) {
        this.page=page;
    }
    
    async finishBuy(){
        

        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL(url);
    }

    async verifyQuantity(){
        const productQuantity = parseInt((await this.page.locator("xpath=//span[@class='shopping_cart_badge']").allInnerTexts()).toString());
        const lstProductsOnCards = await this.page.locator("xpath=//div[@class='cart_item']").elementHandles();
        await expect(lstProductsOnCards).toHaveLength(productQuantity);
    }
}