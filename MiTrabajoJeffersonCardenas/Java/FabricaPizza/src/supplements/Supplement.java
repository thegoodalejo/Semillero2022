package supplements;
import java.util.*;

import entity.Supply;

public class Supplement {
	
	private int stock;
	
	List<Supplement> supplements = new ArrayList();
	
	public Supplement() {
		this.stock = 1;
		supplements.add(this);
	}
	
	/*Methods*/
	
	public void getSupplement(Supplement supplement) {
	
		for(Supplement sup : supplements) {
			if(sup.getClass().getName()  == supplement.getClass().getName()) {
				Supply.validateAmount(supplement);
				break;
			}
		}
	}
	
	public boolean validatedAmount() {
		
		return this.stock > 0 ? true : false;
	}
	
	public void reduceAmount() {
		this.stock--;
	}
	
	public void supply() {
		this.stock += 3;
	}
	
	/************/
	
	/*GETTER & SETTER*/
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	/************************************/
	

}
