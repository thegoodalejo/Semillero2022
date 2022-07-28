import { expect, Page } from "@playwright/test";


export class FormSearchToursPage {
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async searchTours(cityName:string, day:string,cantAdult:string,cantChild:string ){

        /*Definimos tres constantes en las cuales almacenamos los localizadores de los elementos
                                        btnTours
                                        txtSearchCity
                                        txtCity
                                        txtDate
                                        dayDate
                                        inputqtyAdult
                                        inputqtyChild
                                        btnSearchTours
        */
        const btnTours = this.page.locator("xpath=//button[@id='tours-tab']");
        const txtSearchCity = this.page.locator("xpath=//span[@id='select2-tours_city-container']");
        const txtCity = this.page.locator("xpath=//input[@class='select2-search__field']");
        const resultSearchCity = this.page.locator("xpath=//li[@class='select2-results__option select2-results__option--highlighted']");
        const btnDate = this.page.locator("xpath=(//input[@id='date'])[1]");
        const dayDate = this.page.locator(`xpath=//div[@class = 'datepicker dropdown-menu' and contains( @style, 'display: block;' )]//td[@class = 'day ' and text()='${day}']`);
        const btnTravellers = this.page.locator("xpath=//p[text() = 'Travellers ']//span[@class='guest_tours']");
        const inputqtyAdult = this.page.locator("xpath=//input[@id='tours_adults']");
        const inputqtyChild = this.page.locator("xpath=//input[@id='tours_child']");
        const btnSearchTours = this.page.locator("xpath=(//button[@id='submit'])[2]");

        
        /*Click en el boton Tours */
        await btnTours.click();

        /*Click en el campo SearchCity */
        await txtSearchCity.click();
        
        /* Pasamos el parametro cityName al campo SearchCity */
        await txtCity.fill(cityName);

        /* Click text=Medellin,Colombia*/
        await resultSearchCity.click();
        
        /* Click en el campo btnDate*/
        await btnDate.click();
       
        /* Seleccionar el dia */
        await dayDate.click();

        //* Click en el boton de Travellers*/
        await btnTravellers.click();
        
        /* Pasamos el parametro cantAdult al campo inputqtyAdult */
        await inputqtyAdult.fill(cantAdult);
        
        /* Pasamos el parametro cantChild al campo inputqtyChild */
        await inputqtyChild.fill(cantChild);
        
        /* Click en el boton Search*/
        await btnSearchTours.click();
    }
    async isOnTours(date:string){
        /*Validamos que el usuario es redirigido a la pagina de SearchTours*/
        await expect(this.page.locator("xpath=//div[@class='left-side-info rtl-align-right']//p[1]")).toContainText(date);
    }


}
