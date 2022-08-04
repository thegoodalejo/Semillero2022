import { test, expect } from '@playwright/test';
import { HomePage } from '../scr/HomePage';
import { HotelListPage } from '../scr/HotelListPage';

test('test', async ({ page }) => {

  const lugar = 'San andres';
  const checkIn = '2022-08-31';
  const checkOut = '2022-09-04';
  const adultos = '2';
  const habitaciones = '2';

  const homePage = new HomePage(page);
  const hotelList = new HotelListPage(page);

  await homePage.navigate();
  await homePage.searchHotel(lugar,checkIn,checkOut,adultos,habitaciones);
  await hotelList.searchHotel();
  
});