import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';
import { InventoryPage } from '../src/pages/InventoryPage';
import { CarPage } from '../src/pages/CarPage';
import { StepOnePage } from "../src/pages/StepOnePage"
import { StepTwoPage } from "../src/pages/StepTwoPage"

const userName = "standard_user";
const password = "secret_sauce";
test(`
    Give I was added products to my Shopping Car
    When I was clicked on finish
    Then I saw the messase Thank You For Your Order
        `, async ({ page }) => {
            const loginPage = new LoginPage(page);
            const inventoryPage = new InventoryPage(page);
            const carPage = new CarPage(page);
            const stepOnePage = new StepOnePage(page);
            const stepTwoPage = new StepTwoPage(page);

            await loginPage.navigate();
            await loginPage.login(userName,password);
            await inventoryPage.addItemsToShoppingCar();
            await carPage.finishBuy();
            await stepOnePage.fillUserData();
            await stepTwoPage.generateBill();
    
});