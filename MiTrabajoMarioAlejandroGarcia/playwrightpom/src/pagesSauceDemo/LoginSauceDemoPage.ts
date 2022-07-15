import { Page, expect } from "@playwright/test";


export class LoginSauceDemoPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async logIn(userName:string, password:string){
        /*Definimos tres constantes en las cuales almacenamos los localizadores de los elementos
                username|password|boton Login
        */
        const txtuserName = this.page.locator('[data-test="username"]');
        const txtpassword = this.page.locator('[data-test="password"]');
        const btnLogin = this.page.locator('[data-test="login-button"]');

        // Fill [data-test="username"]
        await txtuserName.fill(userName);
        // Fill [data-test="password"]
        await txtpassword.fill(password);

        // Click [data-test="login-button"]
        await btnLogin.click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
    }
    async navegate(){
        // Go to https://www.saucedemo.com/
        await this.page.goto('https://www.saucedemo.com/');
    }
}