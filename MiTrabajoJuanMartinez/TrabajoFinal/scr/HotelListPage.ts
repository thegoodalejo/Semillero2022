import { Page, expect } from "@playwright/test";

export class HotelListPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async searchHotel() {
        
        await this.page.locator("xpath=(//div[@data-filters-group='review_score']/div//div[@class='dcd1ccc0b6'])[1]").click();
        await this.page.waitForTimeout(1000);
        await this.page.locator("xpath=//button[@data-testid='sorters-dropdown-trigger']").click();
        await this.page.waitForTimeout(1000);
        await this.page.locator("xpath=//button[@data-id='price']").click();
        await this.page.waitForTimeout(1000);
        console.log("El valor del Hotel mas economico con 9 o más de calificación y a menos de 500 metros de la playa es :"+await this.page.locator("xpath=(//span[contains(text(),' 50 m') or contains(text(),'100 m')or contains(text(),'150 m')or contains(text(),'200 m')or contains(text(),'250 m')or contains(text(),'300 m')or contains(text(),'350 m')or contains(text(),'400 m')or contains(text(),'450 m')or contains(text(),'500 m')])[1]/ancestor-or-self::div[@class='d20f4628d0']//span[@class='fcab3ed991 bd73d13072']").textContent());

    }
}