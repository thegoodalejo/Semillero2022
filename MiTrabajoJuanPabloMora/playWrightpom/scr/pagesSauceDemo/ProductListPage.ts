import { expect, Page } from "@playwright/test";


export class ProducstListPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async addProductToCar(){

          // Click [data-test="add-to-cart-sauce-labs-backpack"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();

        // Click [data-test="add-to-cart-sauce-labs-bolt-t-shirt"]
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
        await this.page.locator('a:has-text("2")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }

    // async isInTo(){


    // }

    // async navegate(){
    //       // Go to https://www.saucedemo.com/
    //       await this.page.goto('https://www.saucedemo.com/')

    // }

    }
