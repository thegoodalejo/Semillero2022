import {Page, expect} from '@playwright/test';

export class FlightsPage{

    page : Page;

    constructor(page : Page){
        this.page = page;
    }

   async searchCheapFlight() {

    const allPrice = await this.page.locator("xpath=//ul[@class = 'catalog-panel']/li//button/strong").allInnerTexts();
    
    /**SE LIMIPIA EL SET DE DATOS */
    const allPriceClean = allPrice.map((price)=>{

        return price.replace('USD ', '');
    });
    /************************* */
    
    const allPriceNumber : number[] = [];

    for(let price of allPriceClean){
        allPriceNumber.push(parseInt(price));
    }

    console.log("VUELO MAS BARATO");
    console.log(Math.min(...allPriceNumber));

   }
}