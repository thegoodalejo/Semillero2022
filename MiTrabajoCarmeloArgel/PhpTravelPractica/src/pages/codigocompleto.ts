import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {

  // Go to https://www.phptravels.net/
  await page.goto('https://www.phptravels.net/');

  // Click button[role="tab"]:has-text("flights")
  await page.locator('button[role="tab"]:has-text("flights")').click();

  // Click text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').click();

  // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill('medellin');

  // Press ArrowDown
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').press('ArrowDown');

  // Press Tab
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').press('Tab');

  // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill('cancun');

  // Press ArrowDown
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').press('ArrowDown');

  // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
  await page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();

  // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la >> nth=0
  await page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyInc > .la').first().click();

  // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la
  await page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div:nth-child(2) > .qty-box > .qtyBtn > .qtyInc > .la').click();

  // Click #flights-search
  await page.locator('#flights-search').click();
  await expect(page).toHaveURL('https://www.phptravels.net/flights/en/usd/eoh/cun/oneway/economy/16-07-2022/2/1/0');

});