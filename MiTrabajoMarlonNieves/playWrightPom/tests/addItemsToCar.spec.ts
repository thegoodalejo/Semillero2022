import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pagesSouceDemo/LoginPage';
import { ProducListPage } from '../src/pagesSouceDemo/ProductListPage';
import { ShoppingCardPage } from '../src/pagesSouceDemo/ShoppingCarPage';

test(`
Given the user was logged successfull
When the user add item to card
Then the user saw the item in the car`,
  async ({ page }) => {
    const loginPage = new LoginPage(page);
    const producListPage = new ProducListPage(page);
    const shoppingCardPage = new ShoppingCardPage(page);


    await loginPage.navigate();
    await loginPage.LogIn();
    await producListPage.AddProductsToCar()
    await shoppingCardPage.howManyProducts();
  });