import { Page } from "@playwright/test";




export class LoginPage{
    readonly page: Page;
    constructor(page: Page){
        this.page = page;
    }
    async LogIn(){
         // Fill input[name="userName"]
         await this.page.locator('input[name="userName"]').fill('admin');
         // Fill input[name="password"]
         await this.page.locator('input[name="password"]').fill('admin');

        // Click text=Submit
        await this.page.locator('text=Submit').click();

        //locator mapeo del elemento y luego mando el texto
        //await this.page.locator('').fill('');
        //otra forma mando elemento y texto en ua linea
        //await this.page.fill('','');
    }

    async navigate(){
        // Go to https://demo.guru99.com/test/newtours/
        await this.page.goto('https://demo.guru99.com/test/newtours/');

    }
}