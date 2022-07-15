import {Page, expect} from '@playwright/test';

export class BuyProducts {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    // Visualizamos en el carrito los productos seleccionados 
    async listProducts(){

        await this.page.locator('[data-test="checkout"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');

    }

    // Completamos la información solicitada usando parametros y continuar
    async checkoutInformation(firstName: string, lastName: string, postalCode: string){

        await this.page.locator('[data-test="firstName"]').click();
        await this.page.locator('[data-test="firstName"]').fill(firstName);
        await this.page.locator('[data-test="lastName"]').click();
        await this.page.locator('[data-test="lastName"]').fill(lastName);
        await this.page.locator('[data-test="postalCode"]').click();
        await this.page.locator('[data-test="postalCode"]').fill(postalCode);
        await this.page.locator('[data-test="continue"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-two.html');
    }

    // Finalizamos la compra y visualizamos "THANK YOU FOR YOUR ORDER"
    async checkoutOverview(){

        await this.page.locator('[data-test="finish"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-complete.html');
    }
}