import { Page, expect } from "@playwright/test";



export class LoginPage{

    readonly page: Page;

    constructor (page : Page){
        this.page = page;
    }

    async logIn(userName : string, password : string){

        const txtUserName = this.page.locator('input[name="userName"]');
        const txtPassword = 'input[name="password"]';
        // Fill input[name="userName"]
        await txtUserName.fill(userName);

        // Fill input[name="password"]
        await this.page.fill(txtPassword,password);

          // Click text=Submit
        await this.page.locator('text=Submit').click();
    }

    async navigate(){
        
        // Go to https://demo.guru99.com/test/newtours/
        await this.page.goto('https://demo.guru99.com/test/newtours/');
    }

    async isLogIn(){
        await expect(this.page.locator('text=Login Successfully'), 'should be logged in').toBeVisible();
    }
}