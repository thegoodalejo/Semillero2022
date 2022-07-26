package com.sophos.semillero.tasks;

import java.util.List;

import com.sophos.semillero.interactions.FillTourDataInteraction;
import com.sophos.semillero.models.TourInformation;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class FillDataToursTask implements Task{

	private List<TourInformation> tourData;
	
	public FillDataToursTask(DataTable data) {
		this.tourData = data.asList(TourInformation.class);
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		FillTourDataInteraction.fillData(tourData.get(0))
				);
		}
	
	public static FillDataToursTask withTourData(DataTable data) {
		return Tasks.instrumented(FillDataToursTask.class, data);
	}

}
