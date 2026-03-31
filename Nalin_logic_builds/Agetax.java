package Nalin_logic_builds;

import java.util.Scanner;

public class Agetax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int age = scr.nextInt();
		double income = scr.nextDouble();
		
		if (age > 18 && income >=500000) System.out.println("Eligible to pay tax");
		else System.out.println("Not eligible");

	}

}
