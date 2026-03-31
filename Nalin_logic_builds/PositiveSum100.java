package Nalin_logic_builds;

import java.util.Scanner;

public class PositiveSum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		if(num1<0 || num2<0) {
			System.out.println("Any one value entered is negative");
			return;
		}
		
		if (num1+num2<=100) System.out.println("Valid input and sum is less than 100");
		else System.out.println("Sum is greater than 100");

	}

}
