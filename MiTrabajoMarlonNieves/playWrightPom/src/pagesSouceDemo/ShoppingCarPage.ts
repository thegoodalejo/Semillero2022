import { expect, Page, selectors } from "@playwright/test";




export class ShoppingCardPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async howManyProducts() {
        const cards = await this.page.locator("xpath=//div[@class = 'cart_item']");
        await expect(cards).toHaveCount(2);

       /*  query selectors */
        /* await expect(this.page.$$("xpath=//div[@class = 'cart_item']")).toHaveLength(2); */

    }

}