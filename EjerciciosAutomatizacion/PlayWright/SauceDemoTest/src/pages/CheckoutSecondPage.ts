import {Page, expect} from '@playwright/test';

export class CheckoutSecondPage{

    readonly page : Page;

    constructor(page : Page){
        this.page = page;
    }

    async isInCheckoutSecondPage(){

        await expect(this.page.locator("xpath=//span[@class= 'title']")).toBeVisible();

    }

    async clickBtnFinish(){

        await this.page.locator("xpath=//button[@name= 'finish']").click();
        
    }
}