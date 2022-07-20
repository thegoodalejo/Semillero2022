import { test, expect } from '@playwright/test';
import{HomePhpTravelsPage} from '../src/pagesPhpTravels/HomePhpTravelsPage';
import{FormSearchToursPage} from '../src/pagesPhpTravels/FormSearchToursPage';

test.beforeEach(async({page})=>{
    /* Se crea una instancia de la clase LoginSauceDemo */
    const homePhpTravelsPage = new HomePhpTravelsPage(page);

    /* Ejecucion del metodo navegate */
    await homePhpTravelsPage.navigate();
});
test('test', async ({ page }) => {
    /* Se crea una instancia de la clase FormSearchToursPage */
    const formSearchToursPage = new FormSearchToursPage(page);
    let cityName = 'Medellin';
    let date = '20-07-2022';
    let day = '20';
    let cantAdult = '5';
    let cantChild = '4';

   await formSearchToursPage.searchTours(cityName, day,cantAdult,cantChild);
   await formSearchToursPage.isOnTours(date);
});