import { Page } from "@playwright/test";

export class LoginPage{
 readonly page:Page

    constructor(page:Page){
    this.page=page 


            }
            async logIn(){
                
                await this.page.locator('').fill('');
                await this.page.fill('',''); 
        
                
    
                 await this.page.locator('input[name="userName"]').fill('pepe22');

    
                 await this.page.locator('input[name="password"]').fill('123');
                 await this.page.locator('text=Submit').click();
            }

            async navegate() {
                
    
                await this.page.goto('https://demo.guru99.com/test/newtours/');
                }

}