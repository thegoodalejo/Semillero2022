import { Page } from "@playwright/test";


export class LoginPage{

    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }

    async logIn(){
        
    // Fill input[name="userName"]
    await this.page.locator('input[name="userName"]').fill('errer');
    // Fill input[name="password"]
    await this.page.locator('input[name="password"]').fill('23435');
    // Click text=Submit
    await this.page.locator('text=Submit').click();    
    
    }

    async navegate(){
  
    // Go to https://demo.guru99.com/test/newtours/
    await this.page.goto('https://demo.guru99.com/test/newtours/');
}



}