import { Page, expect } from "@playwright/test";

export class LoginPage {
  readonly page: Page;
  nombre="standard_user"
  clave="secret_sauce"
  constructor(page: Page) {
    this.page = page;
  }

  async navigate(){
    // Go to https://demo.guru99.com/test/newtours/
    await this.page.goto('https://www.saucedemo.com/');
  }


  async logIn() {

    // Fill input[name="userName"]
    await this.page.locator('[data-test="username"]').fill(this.nombre);

    // Fill input[name="password"]
    await this.page.locator('[data-test="password"]').fill(this.clave);

    // Click text=Submit
    await this.page.locator('[data-test="login-button"]').click();
  await expect(this.page).toHaveURL('https://www.saucedemo.com/inventory.html');

  }
  
}
