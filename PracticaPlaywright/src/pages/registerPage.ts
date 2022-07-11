import { Page, expect } from '@playwright/test';;



export class RegisterPage{
    readonly page: Page;
    constructor(page: Page){
        this.page = page;
    }
        async register(){
    // Fill input[name="firstName"]
    await this.page.locator('input[name="firstName"]').fill('Equipo tres');
    
    // Fill input[name="lastName"]
    await this.page.locator('input[name="lastName"]').fill('Semillero');
    
    // Fill input[name="firstName"]
    await this.page.locator('input[name="firstName"]').fill('Equipo Tres');
    
    // Fill input[name="phone"]
    await this.page.locator('input[name="phone"]').fill('3218230315');
    
    // Fill input[name="userName"]
    await this.page.locator('input[name="userName"]').fill('equipotres');

    // Fill input[name="userName"]
    await this.page.locator('input[name="userName"]').fill('equipotres@gmail.com');

    // Fill input[name="address1"]
    await this.page.locator('input[name="address1"]').fill('Calle 65a #31-28');

    // Fill input[name="city"]
    await this.page.locator('input[name="city"]').fill('La dorada');
    
    // Fill input[name="state"]
    await this.page.locator('input[name="state"]').fill('Caldas');
    
    // Fill input[name="postalCode"]
    await this.page.locator('input[name="postalCode"]').fill('+57');
    // Select COLOMBIA
    await this.page.locator('select[name="country"]').selectOption('COLOMBIA');

    // Fill input[name="email"]
    await this.page.locator('input[name="email"]').fill('equipotres');

    // Fill input[name="password"]
    await this.page.locator('input[name="password"]').fill('Equipo3');

    // Fill input[name="confirmPassword"]
    await this.page.locator('input[name="confirmPassword"]').fill('Equipo3');

    // Click text=Submit
    await this.page.locator('input[name="submit"]').click();
    }

        async navigate(){
            // Go to https://demo.guru99.com/test/newtours/register.php
            await this.page.goto('https://demo.guru99.com/test/newtours/register.php');   
        }

        async redirect(){
            await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/register_sucess.php');
        }
    }