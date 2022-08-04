import { Page, expect } from "@playwright/test";



export class HomePage{

    readonly page: Page;

    constructor (page : Page){
        this.page = page;
    }

    async searchHotel(lugar,checkIn,checkOut,adultos,habitaciones){
        
        await this.page.locator("xpath=//input[@id='ss']").fill(lugar);
        await this.page.locator("xpath=(//span[@class='sb-date-field__icon sb-date-field__icon-btn bk-svg-wrapper calendar-restructure-sb'])[1]").click();
        await this.page.locator(`xpath=//td[@data-date='${checkIn}']`).click();
        await this.page.locator("xpath=//div[@data-bui-ref='calendar-next']").click();
        await this.page.locator(`xpath=//td[@data-date='${checkOut}']`).click();
        await this.page.locator("xpath=//div[@class='xp__input-group xp__guests']").click();
        await this.page.locator("xpath=//button[@aria-label='Aumenta el número de Habitaciones']").click();
        await this.page.locator("xpath=//button[@class='sb-searchbox__button ']").click();
    }

    async navigate(){
      
        await this.page.goto('https://www.booking.com/index.es.html');
    }

   
}