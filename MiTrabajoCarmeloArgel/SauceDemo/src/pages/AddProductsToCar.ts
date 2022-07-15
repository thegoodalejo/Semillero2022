import {Page, expect} from '@playwright/test';

export class AddProducts {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    // Agregamos productos al carrito
    async addProductsCar(){
        await this.page.goto('https://www.saucedemo.com/inventory.html');
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
        await this.page.locator('a:has-text("2")').click();
        await this.page.goto('https://www.saucedemo.com/cart.html');
    }
}