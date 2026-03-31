package jrd1;

public abstract class  MenuItem {
	
	private String name;
	private static final String [] VALID_NAMES = {"latte", "cappuccino", "espresso", "americano", "mocha"};

	private double price;
	private static final double MAX_PRICE = 100.00;
	
	
	public MenuItem(String name, double price) {
		
		setName(name);
		setPrice(price);
		
	}
	
	
	// setter methodss
	public void setPrice(double price) {
		
		if (price<0) {
			throw new IllegalArgumentException("Price can not be negative");
		}
		if (price > MAX_PRICE) {
			throw new IllegalArgumentException("Price cannot exceeds - "+MAX_PRICE);
		}
		
		this.price = price;
	}
	
	public void setName(String name) {
		
		String lowercaseName = name.toLowerCase();
		
		for(String validName : VALID_NAMES) {
			
			if (validName.equals(lowercaseName)) {
				this.name = name;
				return;
			}
		}
		
		throw new IllegalArgumentException("We don't have this beverage, please select from "+ String.join(", ", VALID_NAMES));
	}
	
	//getter methodss
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPriceAfterTax() {
		double taxRate = 0.8;
		return price + (price*taxRate);
	}
	
	public abstract double calculateTotalPrice();	

}
