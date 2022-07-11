import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {

  // Go to https://demo.guru99.com/test/newtours/
  await page.goto('https://demo.guru99.com/test/newtours/');

  // Click input[name="userName"]
  await page.locator('input[name="userName"]').click();

  // Fill input[name="userName"]
  await page.locator('input[name="userName"]').fill('admin');

  // Click input[name="password"]
  await page.locator('input[name="password"]').click();

  // Fill input[name="password"]
  await page.locator('input[name="password"]').fill('1234');

  // Click text=Submit
  await page.locator('text=Submit').click();
  await expect(page).toHaveURL('https://demo.guru99.com/test/newtours/login_sucess.php');

});