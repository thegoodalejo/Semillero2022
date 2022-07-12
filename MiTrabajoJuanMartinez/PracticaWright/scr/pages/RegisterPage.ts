import { Page, expect } from "@playwright/test";


export class RegisterPage{

    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async register(){


        // Fill input[name="firstName"]
        await this.page.locator('input[name="firstName"]').fill('equipo2');

        // Fill input[name="lastName"]
        await this.page.locator('input[name="lastName"]').fill('semillero');

        // Fill input[name="phone"]
        await this.page.locator('input[name="phone"]').fill('123456789');

        // Fill input[name="userName"]
        await this.page.locator('input[name="userName"]').fill('equipo2@gmail.com');

        // Fill input[name="address1"]
        await this.page.locator('input[name="address1"]').fill('calle falsa 123');

        // Fill input[name="city"]
        await this.page.locator('input[name="city"]').fill('medellin');

        // Fill input[name="state"]
        await this.page.locator('input[name="state"]').fill('antioquia');

        // Fill input[name="postalCode"]
        await this.page.locator('input[name="postalCode"]').fill('12345');

        // Select COLOMBIA
        await this.page.locator('select[name="country"]').selectOption('COLOMBIA');

        // Fill input[name="email"]
        await this.page.locator('input[name="email"]').fill('equipo2');

        // Fill input[name="password"]
        await this.page.locator('input[name="password"]').fill('admin');

        // Press Tab
        await this.page.locator('input[name="password"]').press('Tab');

        // Fill input[name="confirmPassword"]
        await this.page.locator('input[name="confirmPassword"]').fill('admin');

        // Click input[name="submit"]
        await this.page.locator('input[name="submit"]').click();


    }

    async navegate(){

        // Go to https://demo.guru99.com/test/newtours/
        await this.page.goto('https://demo.guru99.com/test/newtours/register.php');

    }

    



}