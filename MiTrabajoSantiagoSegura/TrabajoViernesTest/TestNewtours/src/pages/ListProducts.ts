import { Page, expect } from "@playwright/test";
export class ListProducts{
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
      }
     
    async AddShoppingCar() {
       
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bike-light"]').click();
        await this.page.locator('span:has-text("2")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
      }




}