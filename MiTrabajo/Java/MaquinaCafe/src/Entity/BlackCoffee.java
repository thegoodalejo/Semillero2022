package Entity;

public class BlackCoffee extends Coffee{

	public BlackCoffee(String size, boolean sugar){
		super(size, sugar);
	}
	
	public void showIngredients() {
		
		System.out.println("****************************");
		System.out.println("Your Black Coffee has");
		System.out.println("Size: " + getSize());
		System.out.println("Sugar: " + isSugar());
		System.out.println("****************************");
	}
	
}
