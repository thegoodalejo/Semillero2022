import { expect, Page } from "@playwright/test";




export class SearchFlightsPage {
    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }
    async selectFlight(from: string, to: string) {
        /*Medellin*/
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill(from);
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();
        await this.page.locator("xpath//*[id='autocomplete']").click();

        /*Mexico*/
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill(to);
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').click();
        await this.page.locator("xpath//*[id='autocomplete2']").click();

        /*Numero pasajeros*/
        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
    }
    async search() {
        // Click #flights-search
        await this.page.locator('#flights-search').click();
        await this.page.waitForSelector('.catalog-panel');
        /* await expect(this.page).toHaveURL('https://phptravels.net/flights/en/usd/eoh/cun/oneway/economy/17-07-2022/2/2/0'); */
    }
    /*Buscar el primer vuelo*/
    async firstFlight() {
        let precio: string[] = [];
        const listFlight = await this.page.locator(`[type='submit'] > strong`);
        for (const el of await listFlight.elementHandles()){
            precio.push((await el.innerText()).toString());
        }
        console.log("Viaje: "+ precio[0])
    }

}