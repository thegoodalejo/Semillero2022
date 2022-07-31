import { Page} from "@playwright/test";


export class ShowPlacePage{
    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async showPlace(){

        console.log(" ");
        console.log(" ");
        console.log(" ");

        const strName = await this.page.locator("xpath=(//div[@data-testid='title'])[2]").allInnerTexts()
        const distance = await this.page.locator("xpath=(//span[@class='acb0d5ead1'])[2]").allInnerTexts();
        const cost = await this.page.locator("xpath=(//span[@class='fcab3ed991 bd73d13072'])[2]").allInnerTexts();

        console.log("*********************************************");
        console.log("Your best found place");
        console.log("*********************************************");
        console.log("Name "+strName);
        console.log("Distance "+distance);
        console.log("Valor "+cost);
        console.log("*********************************************");


    }
}