import { Page, expect} from "@playwright/test";

export class RegisterPage {
  readonly page: Page;

  constructor(page: Page) {
    this.page = page;
  }

  async navigate(){
    // Go to https://demo.guru99.com/test/newtours/
    await this.page.goto('https://demo.guru99.com/test/newtours/');
  } 

  async register() {
    // Click text=REGISTER >> nth=0
    await this.page.locator("text=REGISTER").first().click();
    await expect(this.page).toHaveURL(
      "https://demo.guru99.com/test/newtours/register.php"
    );

    // Fill input[name="firstName"]
    await this.page.locator('input[name="firstName"]').fill("Jhon");

    // Fill input[name="lastName"]
    await this.page.locator('input[name="lastName"]').fill("Doe");

    // Fill input[name="phone"]
    await this.page.locator('input[name="phone"]').fill("22334456");

    // Fill input[name="userName"]
    await this.page.locator('input[name="userName"]').fill("doe@gmail.com");

    // Fill input[name="address1"]
    await this.page.locator('input[name="address1"]').fill("calle 30");

    // Fill input[name="city"]
    await this.page.locator('input[name="city"]').fill("New York");

    // Click input[name="state"]
    await this.page.locator('input[name="state"]').click();

    // Fill input[name="state"]
    await this.page.locator('input[name="state"]').fill("Mexico");

    // Fill input[name="postalCode"]
    await this.page.locator('input[name="postalCode"]').fill("23455656");

    // Select BANGLADESH
    await this.page.locator('select[name="country"]').selectOption("BANGLADESH");

    // Fill input[name="email"]
    await this.page.locator('input[name="email"]').fill("doe");

    // Fill input[name="password"]
    await this.page.locator('input[name="password"]').fill("1234");

    // Fill input[name="confirmPassword"]
    await this.page.locator('input[name="confirmPassword"]').fill("1234");

    // Click input[name="submit"]
    await this.page.locator('input[name="submit"]').click();
    await expect(this.page).toHaveURL(
      "https://demo.guru99.com/test/newtours/register_sucess.php"
    );
  }
}
