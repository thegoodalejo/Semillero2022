import { expect, Page } from "@playwright/test";

export class FlightMedCan {

    readonly page: Page;
    constructor(page: Page) {
        this.page = page;
    }

    async flight() {

        //Elección Aeropuerto Olaya Herrera - Medellin
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill('medellin');
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();
        await this.page.locator("text=EOH Olaya Herrera").click();

        // Elección Aeropuerto Intl Cancun - Mexico 
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill('cancun');
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').click();
        await this.page.locator('text=CUN Cancun IntlCancun, Mexico').click();

        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        await this.page.locator('#flights-search').click();
    }

}