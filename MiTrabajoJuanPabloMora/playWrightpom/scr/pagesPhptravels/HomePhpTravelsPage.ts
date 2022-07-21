import { Page} from "@playwright/test";


export class HomePhpTravelsPage{
    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async navigate(){
        // Go to https://www.phptravels.net/
        await this.page.goto('https://www.phptravels.net/');
    }
}