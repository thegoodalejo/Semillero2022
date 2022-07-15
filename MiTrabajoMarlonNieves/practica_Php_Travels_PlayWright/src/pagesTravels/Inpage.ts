import { test, expect, Page } from '@playwright/test';



export class InPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async navigate() {
        // Go to https://phptravels.net/
        await this.page.goto('https://phptravels.net/');
        
        // Click button[role="tab"]:has-text("flights")
        await this.page.locator('button[role="tab"]:has-text("flights")').click();

    }

}

