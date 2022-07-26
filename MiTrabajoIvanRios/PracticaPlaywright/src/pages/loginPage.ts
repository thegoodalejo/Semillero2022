import { Page, expect } from '@playwright/test';



export class LoginPage{
    readonly page: Page;
    constructor(page: Page){
        this.page = page;
    }
    async login(){
        // Fill input[name="userName"]
        await this.page.locator('input[name="userName"]').fill('equipotres');
        // Fill input[name="password"]
        await this.page.locator('input[name="password"]').fill('Equipo3');

        await this.page.locator('text=Submit').click();
    }
    async navigate(){
        await this.page.goto('https://demo.guru99.com/test/newtours/');
    }
    async redirect(){
        await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/login_sucess.php');
    }
    
}