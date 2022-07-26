import { Page, expect } from '@playwright/test';;

export class RegisterPage{
    readonly page: Page;
    constructor(page: Page){
        this.page = page;
    }
        async register(){
            let locator = this.page.locator;
            await locator('input[name="firstName"]').fill('Equipo tres');
            await locator('input[name="lastName"]').fill('Semillero');
            await locator('input[name="firstName"]').fill('Equipo Tres');
            await locator('input[name="phone"]').fill('3218230315');
            await locator('input[name="userName"]').fill('equipotres');
            await locator('input[name="userName"]').fill('equipotres@gmail.com');
            await locator('input[name="address1"]').fill('Calle 65a #31-28');
            await locator('input[name="city"]').fill('La dorada');
            await locator('input[name="state"]').fill('Caldas');
            await locator('input[name="postalCode"]').fill('+57');
            await locator('select[name="country"]').selectOption('COLOMBIA');
            await locator('input[name="email"]').fill('equipotres');
            await locator('input[name="password"]').fill('Equipo3');
            await locator('input[name="confirmPassword"]').fill('Equipo3');
            await locator('input[name="submit"]').click();
    }

        async navigate(){
            // Go to https://demo.guru99.com/test/newtours/register.php
            await this.page.goto('https://demo.guru99.com/test/newtours/register.php');   
        }

        async redirect(){
            await expect(this.page).toHaveURL('https://demo.guru99.com/test/newtours/register_sucess.php');
        }
    }