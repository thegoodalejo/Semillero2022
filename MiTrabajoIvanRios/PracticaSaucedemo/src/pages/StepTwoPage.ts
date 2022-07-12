import {Page, expect} from '@playwright/test';

export class StepTwoPage {
    readonly page: Page;
    
    constructor(page:Page) {
        this.page=page;
    }
    async calculateTotalPaymentAndTaxes(){
        const cantidadItems =  await parseInt(this.page.locator("xpath=//div[@class='inventory_item_price']").toString());
        console.log(cantidadItems);
        const totalValue = await this.page.locator("xpath=//div[@class='summary_total_label']/text()[2]".toString());
        console.log(totalValue);
        let sumaTotal = 0;
        for (let i=0;i<cantidadItems;i++){
            sumaTotal += await parseInt(this.page.locator("xpath=//div[@class='inventory_item_price']/text()[2]").toString());
        }
        console.log(sumaTotal);
        let taxes = (sumaTotal*0.08).toFixed(2);
        console.log(taxes);
        let totalPayment = sumaTotal + taxes;
        console.log(totalPayment);
        await expect(totalValue.toString()).toMatch(totalPayment.toString());
    }
}