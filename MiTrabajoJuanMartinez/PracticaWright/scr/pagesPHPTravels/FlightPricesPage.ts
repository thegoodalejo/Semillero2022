import test, { Page, expect } from "@playwright/test";

export class FlightPricesPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async isOnFlightPrices() {


        await expect(this.page.locator("xpath=//*[@id='data']")).toBeVisible();

    }

    async listFlightPrices() {


        await this.sleep(3000);

        var listViajes2 = await this.page.$$(`[type='submit'] > strong`);

        console.log("Viajes by $$ ===> " + listViajes2.length);

        const checkboxLocator = this.page.locator(`[type='submit'] > strong`);

        for (const el of await checkboxLocator.elementHandles()) {

            console.log("-" + await el.textContent());

        }

    }

    async sleep(msec) {

        return new Promise(resolve => setTimeout(resolve, msec));

    }


}