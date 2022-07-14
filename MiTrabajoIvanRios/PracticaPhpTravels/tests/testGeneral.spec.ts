import { test, expect } from '@playwright/test';
import { MainPage } from '../src/pages/MainPage'

test('test', async ({ page }) => {
    const mainPage = new MainPage(page);

    await mainPage.navigate();
    await mainPage.searchFlights();

});