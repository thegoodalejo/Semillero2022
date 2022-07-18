import {Page, expect} from '@playwright/test';

export class InventoryPage{

    readonly page : Page;

    constructor(page : Page){
        this.page = page;
    }

    async addItemToCart(products){

        for(let product of products){
            await this.page.locator(`xpath=//a/div[text() = '${product}']//ancestor-or-self::div[@class = 'inventory_item']//button`).click();
        }
        
    }
}