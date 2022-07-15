import {Page, expect} from '@playwright/test';

export class LoginPage{
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }

    // Iniciamos en la pagina principal
    async navigate(){
        await this.page.goto('https://www.saucedemo.com/');
    }
    
    // Realizamos el Login usando parametros
    async login(userName: string, password: string){

        await this.page.locator('[data-test="username"]').click();
        await this.page.locator('[data-test="username"]').fill(userName);
        await this.page.locator('[data-test="password"]').click();
        await this.page.locator('[data-test="password"]').fill(password);
        await this.page.locator('[data-test="login-button"]').click();
        await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');

    }
}