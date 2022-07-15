import { expect, Page } from "@playwright/test";


export class ShoppingCarPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async howManyProducts(){
        //Ingreso al carrito de compras para verificar mis items
        await this.page.locator('a:has-text("2")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
        // Click en verificar compra
        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');

    }

    async InformationUser( firstName:string,lastName:string,postalCode:string,){

        // Digitar nombre
        await this.page.locator('[data-test="firstName"]').click();
        await this.page.locator('[data-test="firstName"]').fill(firstName);
        // Digitar apellido
        await this.page.locator('[data-test="lastName"]').click();
        await this.page.locator('[data-test="lastName"]').fill(lastName);
        // Digitar codigo postal
        await this.page.locator('[data-test="postalCode"]').click();
        await this.page.locator('[data-test="postalCode"]').fill(postalCode);
        // Continuar
        await this.page.locator('[data-test="continue"]').click();

        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-two.html');
    }

    async finalizeBuy(){
        // Finalizar compra
        await this.page.locator('[data-test="finish"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-complete.html');

    }

    }
