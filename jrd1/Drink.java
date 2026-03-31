package jrd1;

public class Drink extends MenuItem{
	
	private boolean isCold;
	
	public Drink (String name, double price, boolean isCold) {
		 /*this.name = name;
		 this.price = price;*/
		super(name,price);
		 this.isCold = isCold;
	}
	public boolean getIsCold() {
		return isCold;
	}
	
	public void setIsCold(boolean isCold) {
		this.isCold = isCold;
	}
	
	@Override
	public double calculateTotalPrice() {
		
		//drink is having 8% tax
		return super.getPrice() * 1.08;
	}
		
	

}

class Food extends MenuItem{
	
	private boolean isVegitarian;
	
	public Food(String name, double price, boolean isVegitarian ) {
		super (name, price);
		
		this.isVegitarian = isVegitarian;
	}
	
	@Override
	public double calculateTotalPrice() {
		//food is having 15% tax

		return super.getPrice() * 1.15;
		
	}
}


