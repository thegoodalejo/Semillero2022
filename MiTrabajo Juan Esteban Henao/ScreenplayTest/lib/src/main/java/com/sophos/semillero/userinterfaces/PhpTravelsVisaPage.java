package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PhpTravelsVisaPage {
	
	public static final Target TAB_VISA = Target.the("Pestania de visa").located(By.id("visa-tab")); 
	public static final Target COMBO_FROMCOUNTRY = Target.the("Combo opciones pais local").locatedBy("(//span[@class='select2-selection select2-selection--single'])[3]"); 
	public static final Target INPUT_COUNTRY = Target.the("Entrada de texto pais local").locatedBy("//input[@class='select2-search__field']"); 
//	public static final Target FIRSTOPTION_FROMCOUNTRY = Target.the("Primera opcion de la lista").locatedBy("//span//ul//li[contains(text(),'{0}')]"); 
	public static final Target COMBO_TOCOUNTRY = Target.the("Combo opciones pais destino").locatedBy("(//span[@class='select2-selection select2-selection--single'])[4]"); 
	public static final Target BTN_SUBMIT = Target.the("Boton para enviar informacion").locatedBy("(//button[@id='submit'])[3]"); 
	public static final Target TXT_FIRSTNAME = Target.the("Entrada de texto nombre").locatedBy("//input[@name='first_name']"); 
	public static final Target TXT_LASTNAME = Target.the("Entrada de texto apellido").locatedBy("//input[@name='last_name']"); 
	public static final Target TXT_EMAIL = Target.the("Entrada de texto email").locatedBy("//input[@name='email']"); 
	public static final Target TXT_PHONE = Target.the("Entrada de texto telefono").locatedBy("//input[@name='phone']"); 
	public static final Target TXT_DATE = Target.the("Entrada de texto fecha").locatedBy("//input[@name='date']"); 
	public static final Target TXT_NOTES = Target.the("Entrada de texto notas").locatedBy("//textarea[@name='notes']"); 
	public static final Target BTN_SUBMIT2 = Target.the("Boton para enviar informacion").locatedBy("//button[@id='submit']"); 
	public static final Target SCROLL = Target.the("Ubicacion referencia para el scroll").locatedBy("(//h4[@class='info__title'])[1]"); 
	
	public static final Target DATEPICKER = Target.the("Calendario").locatedBy("(//input[@class = 'dp form-control form-control-lg'])[2]");
	
	public static final Target INDAY = Target.the("Dia").locatedBy("//div[@class = 'datepicker dropdown-menu' and contains( @style, 'display: block;' )]//td[@class = 'day ' and text() = '{0}']");
	public static final Target FINALMESSAGE = Target.the("Mensaje").locatedBy("(//*[@id='fadein']/div[1]//h2");
//	public static final Target NEXT = Target.the("Next").locatedBy("xpath=//div[@class = 'datepicker dropdown-menu' and contains( @style, 'display: block;' )]//div[@style = 'display: block;']//th[@class = 'next']");

//	public static final Target MONTHYEAR = Target.the("Mes del año").locatedBy("xpath=//div[@class = 'datepicker dropdown-menu' and contains( @style, 'display: block;' )]//div[@style = 'display: block;']//th[@class = 'switch']");
	

}
