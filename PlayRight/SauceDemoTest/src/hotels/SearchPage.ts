import { Page, expect } from "@playwright/test";

export class SearchPage {


  readonly page: Page;

  constructor(page: Page) {
    this.page = page;
  }
  
  async Search(info) {
    // Click text=City Name Search by City Search by City >> span[role="textbox"]
    await this.page.locator('text=City Name Search by City Search by City >> span[role="textbox"]').click();
    // Fill input[role="searchbox"]
    await this.page.locator('input[role="searchbox"]').fill(info.cityName);

    // Espera y selecciona la cuidad 
    await this.page.waitForTimeout(3000);
    await this.page.locator("xpath=//ul[@id='select2-hotels_city-results']//li[1]").click();

    // Click a[role="button"]:has-text("Travellers 2 Rooms 1")
    await this.page.locator('a[role="button"]:has-text("Travellers 2 Rooms 1")').click();

    // Click .roomInc
    await this.page.locator('.roomInc').click();
    // Select the nacionality
    await this.page.locator('//*[@id="nationality"]').selectOption(info.nacionality);

    // Click text=City Name Search by City Medellin,ColombiaMedellin,Colombia Checkin Checkout Tra >> #submit
    await this.page.locator("xpath=//button[@class= 'more_details effect btn btn-primary btn-block btn-lg ladda-button waves-effect']").click();
  }
}