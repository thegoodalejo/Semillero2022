import { Page, expect } from "@playwright/test";
import { CleanText } from '../../utils/CleanText';

export class ResultHotelsPage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async isInResultHotelsPage() {
        let citySearched = await this.page.locator("xpath=//span[@id = 'select2-hotels_city-container']").textContent();
        let cleanCity = await CleanText.formatText(citySearched);
        //console.log(cleanCity);
        await expect(this.page.locator(`xpath=//div[@class = 'breadcrumb-wrap']`)).toBeVisible();
    }

}