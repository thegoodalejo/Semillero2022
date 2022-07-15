import { expect, Page } from "@playwright/test";


export class ProducstListPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async addProductToCar(){
        // Agregar Item 1
        await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
        // Agregar Item 2
        await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
        
    }

    }
