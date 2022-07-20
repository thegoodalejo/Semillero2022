import {test} from '@playwright/test';
import {SearchPage } from '../../src/hotels/SearchPage';
import { ResultHotelsPage } from '../../src/hotels/ResultHotelsPage';

/**Datos buscar la ciudad*/
const info = {
    cityName : 'paris',
    nacionality: 'AL'
    
}
 
const date = {
    checkIn : '19-07-2022',
    ckeckOut: '22-07-2022'
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


    await searchPage.Search(info);
    await resultHotelsPage.isInResultHotelsPage();
    

});