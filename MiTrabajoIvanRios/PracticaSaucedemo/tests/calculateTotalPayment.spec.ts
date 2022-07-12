import { test, expect } from '@playwright/test';
import { LoginPage } from '../src/pages/LoginPage';
import { InventoryPage } from '../src/pages/InventoryPage';
import { CarPage } from '../src/pages/CarPage';
import { StepOnePage } from "../src/pages/StepOnePage"
import { StepTwoPage } from "../src/pages/StepTwoPage"

test(`
    Give I was logged in SauceDemo
    When I was added products to my Shopping Car
    Then I saw that the total payment matches with the sum of the products' price + 8% from taxes.
        `, async ({ page }) => {
            const loginPage = new LoginPage(page);
            const inventoryPage = new InventoryPage(page);
            const carPage = new CarPage(page);
            const stepOnePage = new StepOnePage(page);
            const stepTwoPage = new StepTwoPage(page);

            await loginPage.navigate();
            await loginPage.login();
            await inventoryPage.addItemsToShoppingCar();
            await carPage.finishBuy();
            await stepOnePage.fillUserData();
            await stepTwoPage.calculateTotalPaymentAndTaxes();
    
});