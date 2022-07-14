import { test, expect } from '@playwright/test';
import { SearchPage } from '../scr/pagePhptravels/SearchPage';



test(`
Given I was in the login page
When I was login in   
Then I saw the message login success`, 
async ({ page }) => {

  const searchPage = new SearchPage(page);
  
  await searchPage.navegate();
  await searchPage.flights();


});