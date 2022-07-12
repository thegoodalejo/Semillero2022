import {Page, expect} from '@playwright/test';

export class InventoryPage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    async addItemsToShoppingCar(){
        // Click [data-test="add-to-cart-sauce-labs-backpack"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();

        // Click [data-test="add-to-cart-sauce-labs-fleece-jacket"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-fleece-jacket"]').click();

        // Click [data-test="add-to-cart-sauce-labs-bolt-t-shirt"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();

        // Click ShoppingCar
        await this.page.locator("xpath=//div[@id='shopping_cart_container']").click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }
}