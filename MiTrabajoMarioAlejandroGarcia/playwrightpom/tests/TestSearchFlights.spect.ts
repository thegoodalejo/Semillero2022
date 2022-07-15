import { test, expect } from '@playwright/test';
import { FormSearchFlightsPage } from '../src/pagesPhpTravels/FormSearchFlightsPage';
import { HomePhpTravelsPage } from '../src/pagesPhpTravels/HomePhpTravelsPage';

test('test', async ({ page }) => {
    const homePhpTravelsPage = new HomePhpTravelsPage(page);
    const formSearchFlightsPage = new FormSearchFlightsPage(page);

    await homePhpTravelsPage.navigate();
    await formSearchFlightsPage.searchFlightsOneWay('medellin','cancun','18-07-2022');
});