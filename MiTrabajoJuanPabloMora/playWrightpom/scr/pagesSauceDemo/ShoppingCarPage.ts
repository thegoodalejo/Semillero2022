import { expect, Page } from "@playwright/test";


export class ShoppingCarPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async howManyProducts(){

        const items = await this.page.locator('xpath=//div[@class = "cart_item"]')

        //await expect(cards).toHaveCount(2);
        return await expect(this.page.$$('.cart_item')).toHaveLength(2);

    }

    }
