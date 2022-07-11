import { Page, expect } from "@playwright/test";


export class LoginPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async login(){

        // Fill input[name="userName"]
        await this.page.locator('input[name="userName"]').fill('equipo2');
        // Fill input[name="password"]
        await this.page.locator('input[name="password"]').fill('admin');
        // Click text=Submit
        await this.page.locator('text=Submit').click();
        


    }

    async navegate(){

        // Go to https://demo.guru99.com/test/newtours/
        await this.page.goto('https://demo.guru99.com/test/newtours/');

    }


}