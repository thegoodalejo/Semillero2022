import {test} from '@playwright/test';
import {SearchPage } from '../../src/pages/Hotels/SectionHotelsPage';
import { ResultHotelsPage } from '../../src/pages/Hotels/ResultHotelsPage';

/**Datos buscar la ciudad*/
const info = {
    cityName : 'paris',
    nacionality: 'AL',
    date:{
        checkInDay: "24",
        checkOutDay: "20",
        checkInMonthYear : "December 2022",
        checkOutMonthYear : "February 2023"
    }
    
}
 

test.beforeEach(async ({page})=>{
    await page.goto('https://phptravels.net/');

});

test(`
Given the user was on the inventory page
when adding products to the cart
then he saw that the products were added to the cart.
`, async({page})=>{

    const searchPage = new SearchPage(page);
    const resultHotelsPage = new ResultHotelsPage(page);


    await searchPage.search(info);
    await resultHotelsPage.isInResultHotelsPage();
    

});