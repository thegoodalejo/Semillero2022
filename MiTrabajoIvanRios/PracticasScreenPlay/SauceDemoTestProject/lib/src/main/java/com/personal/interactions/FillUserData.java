package com.personal.interactions;

import com.personal.models.UserInformation;
import com.personal.userinterfaces.CheckoutInformationPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class FillUserData implements Interaction{
	
	private UserInformation user;
	
	public FillUserData(UserInformation user) {
		this.user=user;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
			Enter.theValue(user.getName()).into(CheckoutInformationPage.TXT_NAME),
			Enter.theValue(user.getLastname()).into(CheckoutInformationPage.TXT_LAST_NAME),
			Enter.theValue(user.getZipcode()).into(CheckoutInformationPage.TXT_ZIP_CODE)
				);
	}
	
	public static FillUserData fillForm(UserInformation user) {
		
		return Tasks.instrumented(FillUserData.class, user);		
	}

}
