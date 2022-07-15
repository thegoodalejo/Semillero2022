import { test, expect } from '@playwright/test';
import { InPage } from '../src/pagesTravels/Inpage';
import { SearchFlightsPage } from '../src/pagesTravels/SearchFlights';
import { ViewFlight } from '../src/pagesTravels/ViewFlight';



test(`
Given the user was logged successfull
When the user add item to card
Then the user saw the item in the car`,
  async ({ page }) => {
    test.setTimeout(70000);
    const inpage = new InPage(page);
    const searchflights = new SearchFlightsPage(page);

    let from = 'medellin';
    let to = 'cancun';
   


    await inpage.navigate();
    await searchflights.selectFlight(from,to);
    await searchflights.search();
    await searchflights.firstFlight();

  });