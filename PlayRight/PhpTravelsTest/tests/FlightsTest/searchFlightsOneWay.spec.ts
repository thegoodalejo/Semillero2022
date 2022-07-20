import { test } from "@playwright/test";
import { HomePage } from "../../src/pages/Flights/SectionFlightsPage";

test.beforeEach(async ({page})=>{

    await page.goto("https://www.phptravels.net/");

})

test("test", async ({ page }) => {

  //test.setTimeout(70000);

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

  const homePage = new HomePage(page);

  await homePage.navigateToFlight();
  await homePage.fillFormOneWay(dataFlightOneWay);
  await homePage.searchFlight();
  await homePage.isOnFlightsPage();

});
