import { test, expect, Page } from '@playwright/test';



export class ViewFlight {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async viewFlight() {
        // Click #flights-search
        await this.page.locator('#flights-search').click();
        await expect(this.page).toHaveURL('https://phptravels.net/flights/en/usd/eoh/cun/oneway/economy/17-07-2022/2/2/0');
    }

}