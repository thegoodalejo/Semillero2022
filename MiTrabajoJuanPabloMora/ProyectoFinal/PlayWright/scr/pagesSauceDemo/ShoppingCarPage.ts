import { expect, Page } from "@playwright/test";


export class ShoppingCarPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async howManyProducts(){
        //Ingreso al carrito de compras para verificar mis items
        await this.page.locator('a:has-text("3")').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
        // Click en verificar compra
        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');

    }

    async InformationUser( strFirstName:string,strLastName:string,strPostalCode:string,){

        // Digitar nombre
        await this.page.locator('[data-test="firstName"]').click();
        await this.page.locator('[data-test="firstName"]').fill(strFirstName);
        // Digitar apellido
        await this.page.locator('[data-test="lastName"]').click();
        await this.page.locator('[data-test="lastName"]').fill(strLastName);
        // Digitar codigo postal
        await this.page.locator('[data-test="postalCode"]').click();
        await this.page.locator('[data-test="postalCode"]').fill(strPostalCode);
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
