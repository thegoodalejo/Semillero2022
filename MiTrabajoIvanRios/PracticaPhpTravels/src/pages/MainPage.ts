import {Page, expect} from '@playwright/test';

export class MainPage {
    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async navigate(){
        await this.page.goto('https://www.phptravels.net/');
    }

    async searchFlights(){
        //Clic en pestaña Vuelos
        await this.page.locator('button[role="tab"]:has-text("flights")').click();
        //Llenar origen con medel
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill('medel');
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();    
                //Escoger Olaya Herrera
        await this.page.locator('text=EOH Olaya HerreraMedellin, Colombia').click();
        
        
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill('cancu');
        await this.page.locator("xpath=//form[@class = 'main_search']").click();
        await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').click();
        
        await this.page.locator('text=CUN Cancun IntlCancun, Mexico').click();
        
        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(3) > .qty-box > .qtyBtn > .qtyInc > .la').click();
        await this.page.locator('#flights-search').click();
        await expect(this.page).toHaveURL('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/17-07-2022/2/1/1');
    
        
    }
}