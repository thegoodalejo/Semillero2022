import { Page, expect } from "@playwright/test";

export class HomePage {

  page: Page;

  constructor(page: Page) {
    this.page = page;
  }

  async navigateToFlight() {
    // Click button[role="tab"]:has-text("flights")
    await this.page.locator('button[role="tab"]:has-text("flights")').click();
  }

  async fillFormOneWay(dataFlightOneWay){

    /**Seleccionamos el vuelo */
    await this.selectTrip(dataFlightOneWay.trip);

    /**Selecionamos la calidad del vuelo */
    await this.selectType(dataFlightOneWay.type);

    /**Seleccionamos el lugar de salida */
    await this.setFrom(dataFlightOneWay.from);

    /**Seleccionamos el lugar de llegada */
    await this.setDestination(dataFlightOneWay.destination);

    /**TODO */
    await this.setDate(dataFlightOneWay.date);

    /**TODO */
    await this.setPassengers(dataFlightOneWay.amountAdult, dataFlightOneWay.amountChild, dataFlightOneWay.amountInfant);
  }

  /**Funcion para seleccionar del vuelo
   * 
   * One Way | Round Trip
   * 
   */
  async selectTrip(trip : string){
    // Click text=One Way
    await this.page.locator(`text='${trip}'`).click();
  }

  /**Funcion para seleccionar el tipo de vuelo
   * Economy | Economy Premiun | Bussines | first
   */
  async selectType(type : string){

    await this.page.selectOption(`select#flight_type`, `${type}`);

  }

  /**Funcion para setear el lugar de salida */
  async setFrom(from : string){

    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill(from);

    await this.page.locator("xpath=//form[@class = 'main_search']").click();

    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();

    await this.page.locator("xpath=//div[@class = 'autocomplete-results troll intro in']/div[@class = 'autocomplete-result'][1]").click();

  }

  /**Funcion para setear el lugar de llegada */
  async setDestination(destination : string){

    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill(destination);

    await this.page.locator("xpath=//form[@class = 'main_search']").click();

    await this.page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill(destination);

    await this.page.locator("xpath=//div[@class = 'autocomplete-results troll intro in']/div[@class = 'autocomplete-result'][1]").click();
  }

  /**Funcion para setear la fecha del vuelo */
  async setDate(date : string){

    await this.page.locator('text=Departure Date Return Date >> input[name="depart"]').fill(date);

  }

  /**Funcion para seteat el numero de pasajeros
   * los pasajeros pueden ser: adultos | niños | bebes
   */
  async setPassengers(amountAdult, amountChild, amountInfant){

      await this.page.locator(`xpath=//a[@class= 'dropdown-toggle dropdown-btn waves-effect']`).click();

      await this.page.locator(`xpath=//input[@id= 'fadults']`).fill(amountAdult);
      await this.page.locator(`xpath=//input[@id= 'fchilds']`).fill(amountChild);
      await this.page.locator(`xpath=//input[@id= 'finfant']`).fill(amountInfant);
  }

  /**Funcion para dar click en el boton de buscar */
  async searchFlight() {

    // Click #flights-search
    await this.page.locator("#flights-search").click();

  }

  /**Funcion para validar que si se listo los vuelos en la otra pagina */
  async isOnFlightsPage(){

    /**Espera a que aparezcan la lista de los vuelos en la otra pagina */
    await this.page.waitForSelector('.catalog-panel');

  }
}
