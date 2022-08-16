import { Page, expect } from "@playwright/test";



export class RoundTripPage{

    readonly page: Page;

    constructor (page : Page){
        this.page = page;
    }

    
}   
