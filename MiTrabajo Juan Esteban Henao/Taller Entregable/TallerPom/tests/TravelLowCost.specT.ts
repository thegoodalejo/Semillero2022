import { test, expect } from '@playwright/test';
import { HomePage } from '../src/pagesPhpTravels/HomePage';
import { RoundTripPage } from '../src/pagesPhpTravels/TravelPage';


test(
`Given the user was in the travel page 
When the user completes the trip data 
Then the user saw the cheapest flight`, 


async ({ page }) => {
  
    let fromLocation = "madrid";
    let toLocation = "london";
    let fecha = "18-07-2022";
    let fechaFin = "19-07-2022";
    let aduls = "2";
    let child = "1";
    let infants = "1";
    let rooms = "2";

    const home = new HomePage (page);
    await home.navegate();
    //await home.selectFlight(fromLocation, toLocation, fecha, fechaFin, aduls, child, infants);
    await home.selectHotel(fromLocation,fecha,fechaFin, rooms, aduls, child);
    

});