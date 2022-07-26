package com.personal.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	public static final Target TXT_USERNAME = Target.the("username").located(By.id("user-name"));
	public static final Target TXT_PASSWORD = Target.the("password").located(By.id("password"));
	public static final Target BTN_LOGIN = Target.the("loginBtn").located(By.id("login-button"));
	public static final By LBL_LOCKED_USER = By.xpath("//h3[@data-test='error']");
}
