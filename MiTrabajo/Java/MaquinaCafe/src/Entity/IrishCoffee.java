package Entity;

public class IrishCoffee extends Coffee{

	private boolean whisky;
	private boolean cream;
	
	public IrishCoffee(String size, boolean sugar, boolean whisky, boolean cream) {
		super(size, sugar);
		
		this.whisky = whisky;
		this.cream = cream;
		
	}
	
	
	public void showIngredients() {
		
		System.out.println("****************************");
		System.out.println("You Irish Coffee has");
		System.out.println("Size: " + getSize());
		System.out.println("Sugar: " + isSugar());
		System.out.println("Whisky: " + isWhisky());
		System.out.println("Cream: " + isCream());
		System.out.println("****************************");
	}
	

	//Getter & Setter
	public boolean isWhisky() {
		return whisky;
	}

	public void setWhisky(boolean whisky) {
		this.whisky = whisky;
	}

	public boolean isCream() {
		return cream;
	}

	public void setCream(boolean cream) {
		this.cream = cream;
	}
	//**********************************
	
}
