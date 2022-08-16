import { test, expect } from '@playwright/test';
import { BookingHome } from '../src/pagesBooking/BookingHomePage';
import { BookingHotelsPage } from '../src/PagesBooking/BookingHotelsPage';

test.beforeEach(async ({ page }) => {
    await page.goto('https://www.Booking.com/');
});

test(`
Given I was in the https://www.booking.com 
When I want to search for an accommodation on the Booking hotels page
Then To find an accommodation according to my need`,
async ({ page }) => {
 
    //inilización de las paginas
    const completeInfo = new BookingHome(page);
    const getCheapPrice = new BookingHotelsPage(page);

    //variables para la prueba
    let language = "Español";
    let location = "SAN ANDRES";
    let fechaInicio = "2022-08-31";
    let fechaFin = "2022-09-04";


    //ejecución de las pruebas
    await completeInfo.changeLanguaje(language);
    await page.waitForTimeout(2000);
    await completeInfo.completeCity(location);
    await page.waitForTimeout(2000);
    await completeInfo.completeDate(fechaInicio, fechaFin);
    await page.waitForTimeout(2000);
    await completeInfo.selectPasengerAndHabitations();
    await page.waitForTimeout(2000);
    await getCheapPrice.cheapPrice();

});