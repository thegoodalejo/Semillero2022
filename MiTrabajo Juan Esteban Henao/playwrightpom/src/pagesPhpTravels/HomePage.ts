import { expect, Page } from "@playwright/test";



export class HomePage {

  readonly page: Page;

  constructor(page: Page) {
    this.page = page;
  }

  async navegate() {
    // Go to https://www.phptravels.net/flights
    await this.page.goto('https://www.phptravels.net');
  }

  async selectFlight(fromLocation: string, toLocation: string, fecha: string,
    fechaFin: string, aduls: string, child: string, infants: string) {

    await this.selectCityFlight(fromLocation, toLocation);
    await this.selectDateFlight(fecha);
    await this.selectPassengersFlight(aduls, child, infants);
    await this.validateFLight();
  }

  async selectCityFlight(from: string, toDestination: string) {

    // Click button[role="tab"]:has-text("flights")
    await this.page.locator('button[role="tab"]:has-text("flights")').click();
    await this.selectFromFlight(from);
    await this.selectDestinationFlight(toDestination);
  }

  async selectFromFlight(from: string) {
    // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill(from);
    await this.page.locator("xpath=//form[@class = 'main_search']").click();
    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();
    // Click text=MAD BarajasMadrid, Spain
    await this.page.locator('xpath=//div[@class="autocomplete-results troll intro in" ]/div[@data-index="0"]').click();
  }

  async selectDestinationFlight(toDestination: string) {
    // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill(toDestination);
    await this.page.locator("xpath=//form[@class = 'main_search']").click();
    // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').click();
    // Click text=Charles De Gaulle
    await this.page.locator('//div[@class="autocomplete-results troll intro in" ]/div[@data-index="0"]').click();
  }

  async selectDateFlight(date: string) {
    // Click text=Departure Date Return Date >> input[name="depart"]
    await this.page.locator('text=Departure Date Return Date >> input[name="depart"]').fill(date);
  }

  async selectPassengersFlight(aduls: string, child: string, infants: string) {
    // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
    await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
    // Click text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]
    await this.page.locator('text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]').fill(aduls);
    // Click #fchilds
    await this.page.locator('#fchilds').fill(child);
    // Click #finfant
    await this.page.locator('#finfant').fill(infants);
  }

  async selectCheapestFlight() {
    // obtiene todos los vuelos resultantes y selecciona el primero
    // await this.page.locator('.theme-search-results-item-mask-link').first().click();

    // forma 2
    const vuelos = await this.page.locator('xpath=//div[@class="theme-search-results-item-mask-link"]');

    /*vuelos.forEach(element => {
      console.log(element);
    });*/

  }

  async validateFLight() {

    // Click button:has-text("Search")
    await this.page.locator('xpath=//*[@id="flights-search"]').click();
    await expect(this.page).toHaveTitle("Flights - PHPTRAVELS");
    // obtiene todos los vuelos resultantes y selecciona el primero
    const result = await this.page.locator('//ul[@class= "catalog-panel"]/li//button/strong').first().allInnerTexts();

    const resultp = result.map((price) => {
      return price.replace("USD", "");
    });

    const allResult: number[] = [];

    for (let price of resultp) {
      allResult.push(parseInt(price));
      console.log("Vuelo barato: ")
      console.log(Math.min(...allResult));

    }

  }

  async selectHotel(city: string, checkIn: string, checkOut: string, rooms: string, aduls: string, childs: string) {

    // Click text=City Name Search by City Search by City >> span[role="textbox"]
    await this.page.locator('text=City Name Search by City Search by City >> span[role="textbox"]').click();

    // Fill input[role="searchbox"]
    await this.page.locator('input[role="searchbox"]').fill(city);
    await this.page.locator('(//ul[@class= "select2-results__options"]/li[@role])[1]').click();


    // Click text=Checkin Checkout >> input[name="checkin"]
    await this.page.locator('text=Checkin Checkout >> input[name="checkin"]').click();
    // Click tr:nth-child(4) > td:nth-child(2) >> nth=0
    await this.page.locator('tr:nth-child(4) > td:nth-child(2)').first().click();
    // Click div:nth-child(28) > .datepicker-days > .table-condensed > tbody > tr:nth-child(4) > td:nth-child(3)
    await this.page.locator('div:nth-child(28) > .datepicker-days > .table-condensed > tbody > tr:nth-child(4) > td:nth-child(3)').click();




    // Click a[role="button"]:has-text("Travellers 2 Rooms 1")
    await this.page.locator('a[role="button"]:has-text("Travellers 2 Rooms 1")').click();
    // Click input[name="roomInput"]
    await this.page.locator('input[name="roomInput"]').fill(rooms);
    // Click text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="adults"]
    await this.page.locator('text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="adults"]').fill(rooms);
    // Click text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="childs"]
    await this.page.locator('text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="childs"]').fill(aduls);
    // Click text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="childs"]
    await this.page.locator('text=Rooms Adults Childs Nationality Select Afghanistan Aland Islands Albania Algeria >> input[name="childs"]').fill(childs);

    await this.page.locator('//button[@class= "more_details effect btn btn-primary btn-block btn-lg ladda-button waves-effect"]').click();
  }

}