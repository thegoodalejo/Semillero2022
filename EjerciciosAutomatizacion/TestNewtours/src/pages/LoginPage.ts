import { Page, expect } from "@playwright/test";

export class LoginPage {
  readonly page: Page;

  constructor(page: Page) {
    this.page = page;
  }

  async navigate(){
    // Go to https://demo.guru99.com/test/newtours/
    await this.page.goto('https://demo.guru99.com/test/newtours/');
  }

  async logIn() {

    // Fill input[name="userName"]
    await this.page.locator('input[name="userName"]').fill("doe");

    // Fill input[name="password"]
    await this.page.locator('input[name="password"]').fill("1234");

    // Click text=Submit
    await this.page.locator("text=Submit").click();

    await expect(this.page).toHaveURL(
      "https://demo.guru99.com/test/newtours/login_sucess.php"
    );
  }
}
