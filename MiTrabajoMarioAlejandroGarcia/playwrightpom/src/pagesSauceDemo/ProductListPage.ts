import { Page, expect } from "@playwright/test";


export class ProductListPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async addProductToCar(){

        /*Definimos tres constantes en las cuales almacenamos los localizadores de los elementos de tipo
        button de los productos y del carrito de compras
                username|password|boton Login
        */
        const btnProductBackPack = this.page.locator("xpath=//button[@id='add-to-cart-sauce-labs-backpack']");
        const btnProductBoltTShirt = this.page.locator("xpath =//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
        const btnCart = this.page.locator('a:has-text("2")');
        
        /* Click en el boton del producto BackPack */
        await btnProductBackPack.click();

       /* Click en el boton del producto Bolt-T-Shirt */
        await btnProductBoltTShirt.click();

        /* Click en el boton del carrito */
        await btnCart.click();
    }
    async isOnCart(){
        /* Valido que el usuario se encuentra en la pagina del carrito */
        await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }
    
}