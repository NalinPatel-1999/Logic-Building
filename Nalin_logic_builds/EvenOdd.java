package Nalin_logic_builds;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		if (num % 2 == 0) System.out.println("Even Number");
		else System.out.println("Odd Number");

	}

}
