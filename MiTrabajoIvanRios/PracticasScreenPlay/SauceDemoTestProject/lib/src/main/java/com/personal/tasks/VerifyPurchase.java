package com.personal.tasks;

import java.util.List;

import com.personal.interactions.FillUserData;
import com.personal.models.UserInformation;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class VerifyPurchase implements Task{
	
	private List<UserInformation> user;
	
	public VerifyPurchase(DataTable user) {
		this.user = user.asList(UserInformation.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				FillUserData.fillForm(this.user.get(1))
				);
		
	}
	
	public static VerifyPurchase withUserInformation(DataTable data) {
		return Tasks.instrumented(VerifyPurchase.class, data);
	}

}
