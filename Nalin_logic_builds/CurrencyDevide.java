package Nalin_logic_builds;

import java.util.Scanner;

public class CurrencyDevide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int currency = scr.nextInt();
		
		if(currency %100 ==0) System.out.println("Evenely");
		else System.out.println("Not possible");

	}

}
