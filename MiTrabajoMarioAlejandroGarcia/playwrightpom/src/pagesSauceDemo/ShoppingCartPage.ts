import { Page, expect } from "@playwright/test";

export class ShoppingCartPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async checkoutOneStep(firstName:string, lastName:string, codePostal:string){
         /* Se Definieron tres constantes en las cuales almacenamos los localizadores de los elementos de tipo
        button del checkout y continue
                                |boton Checkout |boton Login|

            Se definieron tres constantes en las cuales almacenamos los localizadores de los elementos de tipo
            input 
                                |firtsname|lastname|codepostal|   
        */
        const btnCheckout = this.page.locator("xpath=//button[@id='checkout']");
        const txtFirtsName = this.page.locator("xpath=//input[@id='first-name']");
        const txtLastName = this.page.locator("xpath=//input[@id='last-name']");
        const txtCodePostal = this.page.locator("xpath=//input[@id='postal-code']");
        const btnContinue = this.page.locator("xpath=//input[@id='continue']");

        /*Click en el boton Checkout*/
        await btnCheckout.click();
        
        /* EL usuario se redirige a la pagina de Checkout Information*/
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-one.html');
        
         /*Click en el input firstname*/
        await txtFirtsName.click();

        // Fill [data-test="firstName"]
        await txtFirtsName.fill(firstName);
        
        /*Click en el input lastname */
        await txtLastName.click();

        // Fill [data-test="lastName"]
        await txtLastName.fill(lastName);
        
         /*Click en el input codepostal*/
        await txtCodePostal.click();

        // Fill [data-test="postalCode"]
        await txtCodePostal.fill(codePostal);

        /* Click en el boton Continue */
        await btnContinue.click();
    }
    async isOnCheckoutOverview(){
        /* Valido que el usuario se redirige a la pagina CheckoutOverview */
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-step-two.html');
    }
    async confirmPurchase(){
        const btnFinish = this.page.locator("xpath=//button[@id='finish']");
        await btnFinish.click();
    }
    async isOnCheckoutComplete(){
        await expect(this.page).toHaveURL('https://www.saucedemo.com/checkout-complete.html');
    }

    async howManyProducts(){
        //Forma 1
        const itemsCart = this.page.locator('div > .cart_item');
        await expect(itemsCart).toHaveCount(2);

        //Forma 2
        expect(await this.page.$$eval('div > .cart_item',(itemsCart, result) => itemsCart.length == result,2));
    }
}