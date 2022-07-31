import { test, expect } from '@playwright/test';
import { SearchAccommodationPage } from '../scr/pagesBooking/SearchAccommodationPage';
import { HomeBookingPage } from '../scr/pagesBooking/HomeBookingPage'
import { ShowPlacePage } from '../scr/pagesBooking/ShowPlacePage'


test(`
Given El usuario debe estar en la pagina booking.com 
When Quiero buscar un alojamiento en la página booking.com
Then  Para encontrar un alojamiento acorde a mi necesidad`, 

async ({ page }) => {

  //Objetos
  const searchAccommodationPage = new SearchAccommodationPage(page);
  const homeBookingPage = new HomeBookingPage(page);
  const showPlacePage = new ShowPlacePage(page);

  //Metodo Navegar a Url Booking
  await homeBookingPage.navigate();
  //Metodo buscar alojamiento 
  await searchAccommodationPage.SearchRoom();
  //Mostrar Lugar encontrado
  await showPlacePage.showPlace();


});