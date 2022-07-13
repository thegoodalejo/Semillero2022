import { Page, expect } from "@playwright/test";


export class ShoppingCartPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }
    async howManyProducts(){
        //Forma 1
        const itemsCart = this.page.locator('div > .cart_item');
        await expect(itemsCart).toHaveCount(2);
        console.log(await this.page.$$eval('div > .cart_item',(itemsCart, result) => itemsCart.values,2));

        //Forma 2
        expect(await this.page.$$eval('div > .cart_item',(itemsCart, result) => itemsCart.length == result,2));
    }
}