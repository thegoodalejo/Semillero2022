import { expect, Page } from "@playwright/test";

export class FlightList {

    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async list() {

        await this.page.goto('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/16-07-2022/2/1/0');
        
    }

    async lowerPriceList() {

        const lowerPrice = await this.page.locator("xpath=(//button[@class ='btn btn-primary btn-block theme-search-results-item-price-btn ladda waves-effect']/strong)[1]").textContent();
        console.log("- El vuelo de menor precio es: "+ lowerPrice);
    }

}
    