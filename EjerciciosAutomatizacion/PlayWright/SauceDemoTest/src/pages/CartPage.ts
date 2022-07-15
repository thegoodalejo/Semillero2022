import {Page, expect} from '@playwright/test';

export class CartPage{

    readonly page : Page;

    constructor(page : Page){
        this.page = page;
    }

    async navigateToCartPage(){

        await this.page.goto('https://www.saucedemo.com/cart.html');
    }

    /**Funcion para validar si se encuentra en la pagina de Cart */
    async isInCartPage(){
        await expect(this.page.locator("xpath=//span[@class = 'title']")).toBeVisible();
    }

    /**Funcion para validar si la cantidad de productos agregados, conicide con los que hay en el carrito */
    async validateProductsInCart(amount : number){
        
        await expect(this.page.locator("xpath=//div[@class = 'cart_item']")).toHaveCount(amount);

        console.log("Hay " + amount + " productos en el carrito.");
    }

    async buyProducts(){

        await this.page.locator("xpath=//button[@id = 'checkout']").click();
        
    }
}