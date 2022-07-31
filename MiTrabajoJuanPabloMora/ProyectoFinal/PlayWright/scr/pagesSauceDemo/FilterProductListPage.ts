import { Page,expect } from "@playwright/test";


export class FilterProducstListPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async filterProduct(){
        // Filtrar
        await this.page.locator('[data-test="product_sort_container"]').selectOption('lohi');

    }

    async addProduct(){
        // Agregar productos menor y mayor precio
        await this.page.locator("xpath=//button[@id='add-to-cart-sauce-labs-onesie']").click();
        await this.page.locator("xpath=//button[@id='add-to-cart-sauce-labs-fleece-jacket']").click();

    }

    async howManyProducts(){
        //Ingreso al carrito de compras para verificar mis items
        await this.page.locator('a:has-text("2")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }

    }
