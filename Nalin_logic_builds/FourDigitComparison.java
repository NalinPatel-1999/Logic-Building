package Nalin_logic_builds;

import java.util.Scanner;

public class FourDigitComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		int first = num%10;
		int last = (num/1000) %10;
		
		if (first == last) System.out.println("Same");
		else System.out.println("Not same");

	}

}
