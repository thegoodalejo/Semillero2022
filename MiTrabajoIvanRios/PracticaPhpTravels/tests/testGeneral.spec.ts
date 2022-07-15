import { test, expect } from '@playwright/test';
import { MainPage } from '../src/pages/MainPage';
import { PriceListPage } from '../src/pages/PriceListPage';

test('test', async ({ page }) => {
    const mainPage = new MainPage(page);
    const priceListPage = new PriceListPage(page);

    await mainPage.navigate();
    await mainPage.searchFlights();
    await priceListPage.cheapestFlight();

});