package Nalin_logic_builds;

import java.util.Scanner;

public class NumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr =  new Scanner(System.in);
		
		int number = scr.nextInt();
		
		if (number >=100 && number <=999) System.out.println("In range");
		else System.out.println("Not in range");

	}

}
