package com.sophos.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BanistmoPage {
	
	public static final Target BTN_APRENDER_ES_FACIL = Target.the("Boton para acceder a aprender es facil").locatedBy("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/' and @target]");
	public static final Target BTN_LEGALES = Target.the("Boton para acceder al apartado legales").locatedBy("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales/']");
	public static final Target BTN_FATCA = Target.the("Boton para acceder al apartado FATCA").locatedBy("//a[@href='/wps/portal/banistmo/personas/aprender-es-facil/legales/fatca/' and @class='center-block btn btn-primary']");
	public static final Target BTN_PDF = Target.the("Boton para acceder al PDF").locatedBy("(//a[@href='/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-'] )[1]");
	public static final Target VALIDATE_PDF = Target.the("Boton para acceder al PDF").locatedBy("(//a[@href='/wps/wcm/connect/www.banistmo.com11237/ad2e205d-52e5-477f-8eaa-26fc66d73509/PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf?MOD=AJPERES&CVID=mCx33X-'] )[1]");

}
