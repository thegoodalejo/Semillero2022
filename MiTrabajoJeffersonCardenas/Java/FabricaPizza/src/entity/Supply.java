package entity;

import supplements.Supplement;

public class Supply {
	
	public static void validateAmount(Supplement supplement) {
		
		if (supplement.validatedAmount()) {
			supplement.reduceAmount();
		} else {
			System.out.println("Supplying resource...!");
			supplement.supply();
			supplement.reduceAmount();
		}
	}
	
	
}
