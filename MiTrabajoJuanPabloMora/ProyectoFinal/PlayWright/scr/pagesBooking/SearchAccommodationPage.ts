import { Page,expect } from "@playwright/test";


export class SearchAccommodationPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async SearchRoom(){

        const clickInputplace = this.page.locator('[placeholder="¿Adónde vas\\?"]');
        const place = this.page.locator('[placeholder="¿Adónde vas\\?"]');
        const clickGoPlace = this.page.locator('text=San AndrésIslas San Andrés y Providencia, Colombia');
        const clickDate = this.page.locator('[aria-label="\\33 1 agosto 2022"]');
        const clickInputPerson = this.page.locator('div:nth-child(2) > svg');
        const clickAdults = this.page.locator('div:nth-child(2) > .bui-calendar__dates > tbody > tr:nth-child(2) > td');
        const clickNumberAC = this.page.locator('text=Número de personas y habitaciones 2 adultos · 0 niños · 1 habitación');
        const clickRoom = this.page.locator('[aria-label="Aumenta el número de Habitaciones"]');
        const clickSearch = this.page.locator('button:has-text("Buscar")');
        const cbxFilterDistance = this.page.locator("(//div[text()='Menos de 1 km'])[2]");

        await clickInputplace.click();
        await place.fill('san');
        await clickGoPlace.click();
        await clickDate.click();
        await clickInputPerson.click();
        await clickAdults.first().click();
        await clickNumberAC.click();
        await clickRoom.click();
        await clickSearch.click();
        await this.sleep(3000);
        await cbxFilterDistance.click();

    }
    
    async sleep(msec) {
        return new Promise(resolve => setTimeout(resolve, msec));
    }

 }
