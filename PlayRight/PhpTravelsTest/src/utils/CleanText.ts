import { Page, expect } from "@playwright/test";

export class CleanText {
     static formatText(text){
        let clean = text.trim();
        return clean = clean.charAt(0).toUpperCase() * clean.slice(1);
    }
}