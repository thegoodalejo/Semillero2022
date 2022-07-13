import { expect, Page } from "@playwright/test";

export class FlightList {

    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async list() {

        await this.page.goto('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/16-07-2022/2/1/0');
        //await expect(this.page).toHaveURL('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/16-07-2022/2/1/0');
    }



}