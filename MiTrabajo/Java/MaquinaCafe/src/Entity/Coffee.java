package Entity;

public abstract class Coffee {
	
	private String size;
	private boolean sugar;
	
	public Coffee(String size, boolean sugar){
		this.size = size;
		this.sugar = sugar;
	}
	
	public abstract void showIngredients();
	
	//Getter & Setter
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	
	public boolean isSugar() {
		return this.sugar;
	}

	//*********************************
}
