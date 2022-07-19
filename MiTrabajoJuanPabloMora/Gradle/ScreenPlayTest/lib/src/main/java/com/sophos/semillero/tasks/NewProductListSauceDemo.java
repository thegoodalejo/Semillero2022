package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewLoginSauceDemoPage;
import com.sophos.semillero.userinterfaces.NewProductListSauceDemoPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewProductListSauceDemo implements Task{

	private Map <String, String> tablaJuan;
	
	public NewProductListSauceDemo(DataTable dataTable) {
		this.tablaJuan = dataTable.asMap(String.class, String.class);
		System.out.println("Hola soy el constructor vacio de productos");
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(tablaJuan.get("url")),
				Click.on(NewProductListSauceDemoPage.BTN_ITEM1)
				);
		// TODO Auto-generated method stub
		
	}
	public static NewProductListSauceDemo login(DataTable dataTable) {
		return Tasks.instrumented(NewProductListSauceDemo.class,dataTable);
	} 
	
}
