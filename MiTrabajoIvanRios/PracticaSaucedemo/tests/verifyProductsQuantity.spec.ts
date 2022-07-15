import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';
import { InventoryPage } from '../src/pages/InventoryPage';
import { CarPage } from '../src/pages/CarPage';

const userName = "standard_user";
const password = "secret_sauce";
test(`
    Give I was added products to my Shopping Car
    When I was opened the Shopping Car
    Then I saw that products quantity and products list elements match
        `, async ({ page }) => {
            const loginPage = new LoginPage(page);
            const inventoryPage = new InventoryPage(page);
            const carPage = new CarPage(page);
            
            await loginPage.navigate();
            await loginPage.login(userName,password);
            await inventoryPage.addItemsToShoppingCar();
            await carPage.verifyQuantity();
           
    
});