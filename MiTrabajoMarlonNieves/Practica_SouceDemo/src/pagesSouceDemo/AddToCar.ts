import { Page, expect } from '@playwright/test';

export class AddToCardPage {
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }
    async addProductToCar() {

        /* for (let product of products){
            await this.page.locator(`xpath=//a/div[text() = '${products}']//ancestor-or-self::div[@class = 'invetory_item']//button`).click();
        } */
        

        //añadiendo productos al carro de compras
        // Click [data-test="add-to-cart-sauce-labs-backpack"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();

        // Click [data-test="add-to-cart-sauce-labs-bolt-t-shirt"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();

        // Click ShoppingCar
        await this.page.locator("xpath=//div[@id='shopping_cart_container']").click();
        //await this.page.locator('a:has-text("2")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');

        await this.page.locator('a:has-text("2")').click();

        await this.page.goto('https://www.saucedemo.com/cart.html');
    }
}


