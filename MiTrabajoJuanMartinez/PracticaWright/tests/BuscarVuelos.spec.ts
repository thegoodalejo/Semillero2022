import { test, expect } from '@playwright/test';
import { BookPage } from '../scr/pagesPHPTravels/BookPage';
import { FlightPricesPage } from '../scr/pagesPHPTravels/FlightPricesPage';

test('test', async ({ page }) => {

  var OneWayrOrRoundTrip = 'RoundTrip';
  const from = 'mede';
  const to = 'canc';
  const departureDate = '20-07-2022';
  const returnDate = '25-07-2022';
  const adults = '1';
  const childs = '1';
  const infants = '1';
  const flightType = 'economy';
  const bookPage = new BookPage(page);
  const flightPricesPage = new FlightPricesPage(page);

  await bookPage.navegate();

  if (OneWayrOrRoundTrip == 'OneWay')
    await bookPage.bookFlightOneWay(from, to, departureDate, adults, childs, infants, flightType);


  if (OneWayrOrRoundTrip == 'RoundTrip')
    await bookPage.bookFlightRoundTrip(from, to, departureDate, returnDate, adults, childs, infants, flightType);

  
  
  await flightPricesPage.isOnFlightPrices();
  await flightPricesPage.listFlightPrices();

});