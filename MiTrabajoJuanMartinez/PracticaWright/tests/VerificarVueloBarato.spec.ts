import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {

  const adultos='3';
  const ninos='1';
  const infantes='1';


  // Go to https://www.phptravels.net/
  await page.goto('https://www.phptravels.net/');

  // Click button[role="tab"]:has-text("flights")
  await page.locator('button[role="tab"]:has-text("flights")').click();


  // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="Flying From"]').fill('EOH - Olaya Herrera - Medellin');

  // Fill text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]
  await page.locator('text=Flying From To Destination Departure Date Return Date Passengers 1 Adults +12 Ch >> [placeholder="To Destination"]').fill('CUN - Cancun Intl - Cancun');

  // Click text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]
  await page.locator('text=1 Adults +12 Childs 2 - 11 Infants -2 >> a[role="button"]').click();

  // Click .col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyDec > .la >> nth=0
  await page.locator('.col-lg-1 > .input-box > .form-group > .dropdown > .dropdown-menu > div > .qty-box > .qtyBtn > .qtyDec > .la').first().click();

  // Click text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]
  await page.locator('text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]').click();

  // Fill text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]
  await page.locator('text=Adults +12 Childs 2 - 11 Infants -2 >> input[name="adults"]').fill(adultos);

  // Click #fchilds
  await page.locator('#fchilds').click();

  // Fill #fchilds
  await page.locator('#fchilds').fill(ninos);

  // Click #finfant
  await page.locator('#finfant').click();

  // Fill #finfant
  await page.locator('#finfant').fill(infantes);

  // Click #flights-search
  await page.locator('#flights-search').click();

  //test.setTimeout(120000)
  var listViajes2 = await page.$$('xpath= "//button[@class="btn btn-primary btn-block theme-search-results-item-price-btn ladda waves-effect"]/strong"');

    console.log("Viajes by $$ ===> " + listViajes2.length);
  
});