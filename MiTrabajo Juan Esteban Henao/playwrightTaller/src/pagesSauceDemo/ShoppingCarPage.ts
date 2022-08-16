import { Page, expect } from "@playwright/test";


export class ShoppingCarPage{

    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }
    //Este metodo valida que hayan dos articulos en la lista de productos agregados
    async howManyProducts(){
      
        const items = await this.page.locator("xpath=//div[@class = 'cart_item']");

       await expect(items).toHaveCount(2);
       
    }
    //este metodo me simula la entrada de datos para generar la factura 
    async factura(firstName: string, lastName: string, postalCode:string){
        await this.page.locator('[data-test="checkout"]').click();
        await this.page.locator('[data-test="firstName"]').fill(firstName);
        await this.page.locator('[data-test="lastName"]').fill(lastName);
        await this.page.locator('[data-test="postalCode"]').fill(postalCode);
        await this.page.locator('[data-test="continue"]').click();

        await this.page.locator('[data-test="finish"]').click();

          
    }

    async validateMessage(){
        const message = await this.page.locator('text=THANK YOU FOR YOUR ORDER')
        await expect(message).toBeVisible();
    }

}