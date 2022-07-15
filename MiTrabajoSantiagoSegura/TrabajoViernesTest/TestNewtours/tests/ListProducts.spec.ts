import { test, expect } from '@playwright/test';
import { ListProducts } from '../src/pages/ListProducts';
import { LoginPage } from '../src/pages/LoginPage';

test(`
given el usuario esta en la lista de productos
when selecciona dos productos
then los productos se agregan al carro de compras `
, async ({ page }) => {

    const list1 = new ListProducts(page);
    const login1=new LoginPage(page);
    await login1.navigate();
    await login1.logIn();
    await list1.AddShoppingCar();
 

});