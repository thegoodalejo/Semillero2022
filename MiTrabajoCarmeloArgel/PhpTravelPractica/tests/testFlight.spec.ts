import { test, expect } from '@playwright/test';
import { HomePhpTravel } from '../src/pages/homePhpTravel';
import { FlightMedCan } from '../src/pages/FlightMedCan';
import { FlightList } from '../src/pages/flightList';


test(`
Given the user was logged successfull
When the user add item to car
Then the user saw the item in the car`,

  async ({ page }) => {

    // Creamos objetos de cada clase.
    const homePhpTravel = new HomePhpTravel(page);
    const flightMedCan = new FlightMedCan(page);
    const flightList = new FlightList(page);
    
    // Llamamos cada metodo a traves del objeto.
    await homePhpTravel.homePhpTravel();
    await flightMedCan.flight();
    await flightList.list();
    await flightList.lowerPriceList();

  });