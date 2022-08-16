
import { Page, expect } from "@playwright/test";


export class ProductListPage{

    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }

    //este metodo me añade dos items al carrito, da click en el carrito y valida la url generada
    async addProductsToCar(){
        
    // Click en los tres productos a seleccionar
    await this.page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
    await this.page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
    await this.page.locator('[data-test="add-to-cart-sauce-labs-onesie"]').click();

    // Click en en carrito de compras
    await this.page.locator('a:has-text("3")').click();
    await expect(this.page).toHaveURL('https://www.saucedemo.com/cart.html');
    }

  async filterProducts(){
        
  // Click en el filtro de organización
  await this.page.locator('text=Name (A to Z)Name (A to Z)Name (Z to A)Price (low to high)Price (high to low)').click();
  // Select la opcion para organizar productos del mas barato al mas caro
  await this.page.locator('[data-test="product_sort_container"]').selectOption('lohi');

    }

  async chooseProducts(){
  // Click en el producto mas barato
  await this.page.locator('[data-test="add-to-cart-sauce-labs-onesie"]').click();
  // Click en el producto mas caro
  await this.page.locator('[data-test="add-to-cart-sauce-labs-fleece-jacket"]').click();
  }

}