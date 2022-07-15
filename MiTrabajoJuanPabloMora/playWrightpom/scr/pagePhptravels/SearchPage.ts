import { expect, Page } from "@playwright/test";


export class SearchPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async flights(){


 
      const vuelos = this.page.locator('button[role="tab"]:has-text("flights")');
      const direccionsalida = this.page.locator("xpath=//*[@id='autocomplete']");
      const direccionllegada = this.page.locator("xpath=//*[@id='autocomplete2']");
      const click = this.page.locator("//*[@id='one-way']");
      const opcion = this.page.locator("//div[@class='autocomplete-results troll intro in']/div[@data-index='0']");
 
     await vuelos.click();
 
     await direccionsalida.fill('medellin');
     await click.click();
     await direccionsalida.click();
     await opcion.click();
 
     await direccionllegada.fill('cancun');
     await click.click();
     await direccionllegada.click();
     await opcion.click();
 
    // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
    await this.page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();
    // Double click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la >> nth=0
    await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().dblclick();
    // Double click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la
    await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').dblclick();
    // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(3) > .qty-box > .qtyBtn > .qtyInc > .la
    await this.page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(3) > .qty-box > .qtyBtn > .qtyInc > .la').click();
    // Click #flights-search
    await this.page.locator('#flights-search').click();
    await expect(this.page).toHaveURL('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/18-07-2022/3/2/1');
  
    }

    async navegate(){
        // Go to https://www.phptravels.net/
        await this.page.goto('https://www.phptravels.net/');
    }

    }
