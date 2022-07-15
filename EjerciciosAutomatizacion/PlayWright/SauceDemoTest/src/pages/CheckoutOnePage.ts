import {Page, expect} from '@playwright/test';

export class CheckoutOnePage{

    readonly page : Page;

    constructor(page : Page){
        this.page = page;
    }

    async isInCheckoutOnePage(){

        await expect(this.page.locator("xpath=//input[@name = 'firstName']")).toBeVisible();

    }

    async fillForm(data){

        await this.page.locator("xpath=//input[@name = 'firstName']").fill(data.name);
        await this.page.locator("xpath=//input[@name = 'lastName']").fill(data.lastName);
        await this.page.locator("xpath=//input[@name = 'postalCode']").fill(data.zipCode);

    }

    async clickBtnContinue(){

        await this.page.locator("xpath=//input[@name = 'continue']").click();
        
    }
}