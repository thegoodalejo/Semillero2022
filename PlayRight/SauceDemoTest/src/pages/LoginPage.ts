import { Page, expect } from "@playwright/test";

export class LoginPage {

  readonly page: Page;

  constructor(page: Page) {
    this.page = page;
  }

  async logIn(data) {

    // Fill [data-test="username"]
    await this.page.locator('[data-test="username"]').fill(data.user);

    // Fill [data-test="password"]
    await this.page.locator('[data-test="password"]').fill(data.pass);

    // Click [data-test="login-button"]
    await this.page.locator('[data-test="login-button"]').click();

  }

  async isInventoryPage(){

    /**Validamos que si se cargue el inventario */
    await expect(this.page.locator("#inventory_container.inventory_container")).toBeVisible();

  }
}