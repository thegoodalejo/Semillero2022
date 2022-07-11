import { Page } from "@playwright/test";



export class LoginPage{

    readonly page: Page;

    constructor (page : Page){
        this.page = page;
    }

    async logIn(){
        
        // Fill input[name="userName"]
        await this.page.locator('input[name="userName"]').fill('admin');

        // Fill input[name="password"]
        await this.page.locator('input[name="password"]').fill('1234');

          // Click text=Submit
        await this.page.locator('text=Submit').click();
    }

    async navigate(){
        
        // Go to https://demo.guru99.com/test/newtours/
        await page.goto('https://demo.guru99.com/test/newtours/');
    }
}