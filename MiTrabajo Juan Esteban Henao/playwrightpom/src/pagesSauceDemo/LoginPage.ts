import { Page, expect } from "@playwright/test";


export class LoginPage{

    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }

    //este metodo me realiza el inicio de sesión
    async logIn(username: string, password: string){
        
    // Fill [data-test="username"]
    await this.page.locator('[data-test="username"]').fill(username);
    // Fill [data-test="password"]
    await this.page.locator('[data-test="password"]').fill(password);
    // Click [data-test="login-button"]
    await this.page.locator('[data-test="login-button"]').click();
    await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');
    }

    //este metodo me dirige hacia la pagina principal
    async navegate(){
  
    // Go to https://www.saucedemo.com/
    await this.page.goto('https://www.saucedemo.com/');
    }



}