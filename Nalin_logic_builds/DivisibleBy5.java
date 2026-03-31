package Nalin_logic_builds;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int input = scn.nextInt();
		
		if (input%5==0) System.out.println("Input is divisible by 5.");
		else System.out.println("Not divisible by 5.");

	}

}
