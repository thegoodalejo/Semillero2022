import { expect, Page } from "@playwright/test";


export class FormSearchFlightsPage {
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async searchFlightsOneWay(origCity:string, destCity:string, date:string) {

        const btnFligts = this.page.locator("xpath=//button[@data-bs-target='#flights']");
        const txtOrigCity = this.page.locator("xpath=//input[@id='autocomplete']");
        const txtDestCity = this.page.locator("xpath=//input[@id='autocomplete2']");
        const txtDate = this.page.locator("xpath=//input[@class='depart form-control']");


        // Click button[role="tab"]:has-text("flights")
        await btnFligts.click();
        
        // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
        await txtOrigCity.click();
        // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
        await txtOrigCity.fill(origCity);
        // Click text=One Way Round Trip Economy Economy Premium Business First
        await this.page.locator('text=One Way Round Trip Economy Economy Premium Business First').click();
        // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
        await txtOrigCity.click();
        // Click text=EOH Olaya HerreraMedellin, Colombia
        await this.page.locator('text=EOH Olaya HerreraMedellin, Colombia').click();
        // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
        await txtDestCity.click();
        // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
        await txtDestCity.fill(destCity);
        // Click text=One Way Round Trip Economy Economy Premium Business First
        await this.page.locator('text=One Way Round Trip Economy Economy Premium Business First').click();
        // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
        await txtDestCity.click();
        //Click text=CUN Cancun IntlCancun, Mexico
        await this.page.locator('text=CUN Cancun IntlCancun, Mexico').click();
    
        await txtDate.fill(date);
        // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
        // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la >> nth=0
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().click();
        // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(3) > .qty-box > .qtyBtn > .qtyInc > .la
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(3) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        // Click #flights-search
        await this.page.locator('#flights-search').click();
        await expect(this.page).toHaveURL('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/18-07-2022/2/2/1');
    }
}
