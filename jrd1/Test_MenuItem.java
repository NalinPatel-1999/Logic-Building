package jrd1;

public class Test_MenuItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MenuItem burger = new MenuItem("Mocha", 72.73);
		//MenuItem pizza =  new MenuItem("Cappuccino", 10.09);
		
		Drink mocha = new Drink("Mocha", 10, true);
		Food food = new Food ("Cappuccino", 15, true);
		
		System.out.println(mocha.getName()+ " - "+ mocha.getPrice());
		System.out.println(food.getName()+" - "+food.getPrice());
		
		System.out.printf("Burger price from Price after tax - %.2f%n",mocha.getPriceAfterTax());
		System.out.printf("Pizza Price from Price after tax  - %.2f%n",food.getPriceAfterTax());
		
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("Price total calculation Dring %.2f%n", mocha.calculateTotalPrice());
		System.out.printf("Price total calculation Dring %.2f%n", food.calculateTotalPrice());

	}

}
