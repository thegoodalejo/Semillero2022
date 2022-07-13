import { expect, Page } from "@playwright/test";

export class HomePhpTravel {

    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async homePhpTravel() {

    // Go to https://www.phptravels.net/
    await this.page.goto('https://www.phptravels.net/');
    // Click button[role="tab"]:has-text("flights")
    await this.page.locator('button[role="tab"]:has-text("flights")').click(); 
       
    }



}