import { Page, expect } from "@playwright/test";

export class BookingHotelsPage{
    readonly page: Page;

    constructor(page: Page){
        this.page=page;
    }

    //Este metodo selecciona todos los hoteles y arroja el precio mas barato
    async cheapPrice(){
      //Click en el filtro 9 o más de puntuación
        await this.page.locator("(//label[@class='efeda70352']//div[@data-testid='filters-group-label-content' and contains(text(), 'Excelente')])[1]").click();
      const precios =  await this.page.locator("//span[@class='fcab3ed991 bd73d13072']").allInnerTexts();
      console.log(precios);

      //le hago conversion a la estructura de los precios
      const result = precios.map((price) => {
        return price.replaceAll(".", "");
      });

      const resultp = result.map((price) => {
        return price.replaceAll("COP", "");
      });
      const allResult: number[] = [];
      

      //ingreso todos los precios a una lista 
      for (let price of resultp) {
        allResult.push(parseInt(price));
      }
      //imprimo el valor mas barato
      console.log("Price cheap: ");
        console.log(Math.min(...allResult));
    }
}