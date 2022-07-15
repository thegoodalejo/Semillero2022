import {Page, expect} from '@playwright/test';

export class StepTwoPage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }
    async generateBill(){
        await this.page.locator("xpath=//button[@name='finish']").click();
        await expect(this.page.locator("xpath=//h2[@class='complete-header']")).toBeVisible();
    }
}