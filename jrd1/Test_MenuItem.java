package jrd1;

public class Test_MenuItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuItem burger = new MenuItem("Mocha", 72.73);
		MenuItem pizza =  new MenuItem("Cappuccino", 10.09);
		
		System.out.println(burger.getName()+ " - "+ burger.getPrice());
		System.out.println(pizza.getName()+" - "+pizza.getPrice());
		
		System.out.printf("Burger price- %.2f%n",burger.getPriceAfterTax());
		System.out.printf("Pizza Price- %.2f%n",pizza.getPriceAfterTax());

	}

}
