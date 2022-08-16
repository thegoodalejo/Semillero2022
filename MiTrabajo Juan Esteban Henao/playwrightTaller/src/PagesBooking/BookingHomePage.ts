import { Page, expect } from "@playwright/test";

export class BookingHome
{
    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }


    async changeLanguaje(language: string){
  
        //Click en la seleccion de lenguajes
        await this.page.locator('//button[@data-modal-id="language-selection"]').click();
        await this.page.locator('a:has-text("'+language+'")').nth(1).click();
        }

     async completeCity(location : string) {

         //Da click en el campo de texto de entrada
        await this.page.locator('//input[@id="ss"]').click();
         //Ingresa la ciudad destino
        await this.page.locator('//input[@id="ss"]').fill(location);
        // Da click en la primera opción que arroja
        await this.page.locator('(//li[@class="c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--city "])[1]').click();

     } 
     async completeDate(fechaInicio: string, fechaFin: string){
      
        // selecciona la fecha de inicio
        await this.page.locator('//td[@data-date="'+fechaInicio+'"]').click();
        // seleccions la fecha final
        await this.page.locator('//td[@data-date="'+fechaFin+'"]').click();
       
     } 
     async selectPasengerAndHabitations(){
         //Click en el selector de habitaciones y personas
        await this.page.locator('//label[@class= "xp__input"]').click();
        await this.page.locator('//button[@aria-label= "Aumentar cantidad de Habitaciones"]').click();

          // Click en el boton de buscar
        await this.page.locator('button:has-text("Buscar")').click();

     }
}