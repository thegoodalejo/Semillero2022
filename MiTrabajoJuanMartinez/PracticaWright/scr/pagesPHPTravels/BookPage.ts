import test, { Page, expect } from "@playwright/test";


export class BookPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async bookFlightOneWay(from,to,departureDate,adults,childs,infants,flightType) {
        
        // Click button flights
        
        await this.page.locator("xpath=//button[@aria-controls='flights']").click();


        // Fill from
        await this.page.locator("xpath=//*[@id='autocomplete']").fill(from);
        
         // Fill from
         await this.page.locator("xpath=//*[@id='autocomplete']").fill(from);
         await this.page.locator("xpath=//input[@id='one-way']").click();
         await this.page.locator("xpath=//*[@id='autocomplete']").click();
         await this.page.locator("xpath=//div[@data-index ='0']").click();
         
         // Fill to
         await this.page.locator("xpath=//*[@id='autocomplete2']").fill(to);
         await this.page.locator("xpath=//input[@id='one-way']").click();
         await this.page.locator("xpath=//*[@id='autocomplete2']").click();
         await this.page.locator("xpath=//div[@data-index ='0']").click();
        
        // Fill departureDate
        await this.page.locator('text=Departure Date Return Date >> input[name="depart"]').fill(departureDate);
        
        // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();

        // Click Passengers
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyDec > .la').first().click();

        // Fill text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]
        await this.page.locator('text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]').fill(adults);

        // Fill #fchilds
        await this.page.locator('#fchilds').fill(childs);

        // Fill #finfant
        await this.page.locator('#finfant').fill(infants);

        //Select //select[@id = 'flight_type']

        await this.page.locator("xpath=//select[@id = 'flight_type']").selectOption(flightType);

        // Click #flights-search
        await this.page.locator('#flights-search').click();

    }

    async bookFlightRoundTrip(from,to,departureDate,returnDate,adults,childs,infants,flightType) {
        
        // Click button flights
        await this.page.locator('button[role="tab"]:has-text("flights")').click();

        // Check #round-trip
        await this.page.locator('#round-trip').check();


        // Fill from
        await this.page.locator("xpath=//*[@id='autocomplete']").fill(from);
        await this.page.locator("xpath=//input[@id='round-trip']").click();
        await this.page.locator("xpath=//*[@id='autocomplete']").click();
        await this.page.locator("xpath=//div[@data-index ='0']").click();
        
        // Fill to
        await this.page.locator("xpath=//*[@id='autocomplete2']").fill(to);
        await this.page.locator("xpath=//input[@id='round-trip']").click();
        await this.page.locator("xpath=//*[@id='autocomplete2']").click();
        await this.page.locator("xpath=//div[@data-index ='0']").click();
        
        // Fill departureDate
        await this.page.locator('text=Departure Date Return Date >> input[name="depart"]').fill(departureDate);

        // Fill returnDate
        await this.page.locator('input[name="returning"]').fill(returnDate);
        
        // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
        await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();

        // Click Passengers
        await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyDec > .la').first().click();

        // Fill text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]
        await this.page.locator('text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]').fill(adults);

        // Fill #fchilds
        await this.page.locator('#fchilds').fill(childs);

        // Fill #finfant
        await this.page.locator('#finfant').fill(infants);

        //Select //select[@id = 'flight_type']

        await this.page.locator("xpath=//select[@id = 'flight_type']").selectOption(flightType);

        // Click #flights-search
        await this.page.locator('#flights-search').click();

    }

    async navegate() {

        // Go to 
        await this.page.goto('https://www.phptravels.net/');

    }





}