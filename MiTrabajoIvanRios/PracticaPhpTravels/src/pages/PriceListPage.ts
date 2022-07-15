import {Page, expect} from '@playwright/test';

export class PriceListPage {
    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async cheapestFlight(){
        
        const lstTextPrice = await this.page.locator(`[type='submit'] > strong`);
        const textPrice = await lstTextPrice.elementHandles();
        let allPriceNumber:number[]=[];
        for(let price of await textPrice){
            const numberPrice = (await price.textContent()).substring(4).trim();
            allPriceNumber.push(parseInt(numberPrice));
            //console.log("Precio: "+parseInt(price));
        }
        
        for (let price of allPriceNumber){
            console.log(price);
        }
        let minValuePage = parseInt((await this.page.locator("xpath=(//button[@type='submit']/strong)[1]").textContent()).substring(4).trim());
        console.log("Precio De la Pagina: "+minValuePage);

        let cheapestPrice = allPriceNumber[allPriceNumber.length-1]
        for (let el of allPriceNumber){
            cheapestPrice = el<=cheapestPrice ? el:cheapestPrice;
        }
        console.log("Cheapest Flight: "+ cheapestPrice);
        
        await expect(minValuePage).toBeLessThanOrEqual(cheapestPrice);
    }

    
        
        
       
   

}