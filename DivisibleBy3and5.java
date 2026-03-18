package test;

import java.util.Scanner;

public class DivisibleBy3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		int input = scn.nextInt();
		
		if (input % 3 == 0 && input % 5 == 0) System.out.println("Input is divisible by both 3 and 5");
		else System.out.println("Not divisible by 3 and 5 both.");

	}

}
