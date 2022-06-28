package Entity;

public class CoffeeMachine {
	
	public static Coffee makeBlackCoffee(int size, int sugar) {
		
		String sizeCoffee = "";
		boolean isSugar = false;
		
		//validamos el tamaño del cafe
		if (size == 1) {
			sizeCoffee = "Small";
			
		}
		if (size == 2) {
			sizeCoffee = "Medium";
			
		}
		
		if (size == 3) {
			sizeCoffee = "Big";		
		}
		
		//validamos si quiere azucar o no
		
		if (sugar == 1) {
			isSugar = true;
			
		} else if (sugar == 2) {
			isSugar = false;
			
		}
		
		return new BlackCoffee(sizeCoffee, isSugar);		
	}

	public static Coffee makeIrishCoffee(int size, int sugar, int whisky, int cream) {
		
		String sizeCoffee = "";
		boolean isSugar = false;
		boolean isWhisky = false;
		boolean isCream = false;
		
		//validamos el tamaño del cafe
		if (size == 1) {
			sizeCoffee = "Small";
			
		}
		if (size == 2) {
			sizeCoffee = "Medium";
			
		}
		
		if (size == 3) {
			sizeCoffee = "Big";		
		}
		
		//validamos si quiere azucar o no
		
		if (sugar == 1) {
			isSugar = true;
			
		} else if (sugar == 2) {
			isSugar = false;
			
		}
		
		//validamos si quire whisky
		if(whisky == 1) {
			isWhisky = true;
			
		}else if(whisky == 2) {
			isWhisky = false;
		}
		
		//validamos si quiere crema
		if(cream == 1) {
			isCream = true;
			
		}else if(cream == 2) {
			isCream = false;
		}
		
		return new IrishCoffee(sizeCoffee, isSugar, isWhisky, isCream);
	}
}
