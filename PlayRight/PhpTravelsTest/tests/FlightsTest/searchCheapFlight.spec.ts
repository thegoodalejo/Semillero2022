import {test} from '@playwright/test';
import { FlightsPage } from '../../src/pages/Flights/ResultFlightsPage';
import { HomePage } from '../../src/pages/Flights/SectionFlightsPage';

test.beforeEach(async ({page})=>{

    await page.goto("https://www.phptravels.net/");

})
/**Objeto con los datos para diligenciar el formulario */
const dataFlightOneWay = {
    trip: "One Way",
    type: "first",
    from: "medellin",
    destination: "CUN",
    date: "23-07-2022",
    amountAdult: "3",
    amountChild: "1",
    amountInfant: "1",
  };
/************************************************* */

test('test', async ({page}) =>{

    test.setTimeout(70000);

    const homePage = new HomePage(page);
    const flightPage = new FlightsPage(page);

    await homePage.navigateToFlight();
    await homePage.fillFormOneWay(dataFlightOneWay);
    await homePage.searchFlight();
    await homePage.isOnFlightsPage();

    await flightPage.searchCheapFlight();

});