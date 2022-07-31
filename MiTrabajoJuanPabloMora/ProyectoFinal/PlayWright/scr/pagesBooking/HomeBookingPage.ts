import { Page} from "@playwright/test";


export class HomeBookingPage{
    readonly page: Page;

    constructor(page:Page){
        this.page = page;
    }

    async navigate(){
       // Ir a la pagina 
       await this.page.goto('https://www.booking.com/index.es.html?label=gen173nr-1BCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQGIAgGoAgO4AufNi5cGwAIB0gIkNjMwYjRhMjMtOTNkNy00YjM5LWE3MWYtZDkwZGM1MDJmY2Mx2AIF4AIB&sid=40033fb00792822488faea0cd26e38bd&keep_landing=1&sb_price_type=total&');
    }
}