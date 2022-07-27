package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IsVisibleMessageVisa implements Question<Boolean> {

	private Target target;

	public IsVisibleMessageVisa(Target target, String message) {
		this.target = target;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return target.resolveFor(actor).isVisible();
	}

	public static IsVisibleMessageVisa message(Target target, String message) {
		return new IsVisibleMessageVisa(target, message);

	}

}
