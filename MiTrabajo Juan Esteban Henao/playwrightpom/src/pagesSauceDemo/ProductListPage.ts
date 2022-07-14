
import { Page, expect } from "@playwright/test";


export class ProductListPage{

    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }

    async addProductsToCar(){
        
    // Click [data-test="add-to-cart-sauce-labs-backpack"]
    await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
    // Click [data-test="add-to-cart-sauce-labs-bolt-t-shirt"]
    await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
    await this.page.locator('a:has-text("2")').click();
    await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }

}