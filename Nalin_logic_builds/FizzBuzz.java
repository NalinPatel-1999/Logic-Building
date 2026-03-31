package Nalin_logic_builds;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		if (num%3 == 0 && num%5==0) System.out.println("FizzBuzz");
		else if (num%3==0) System.out.println("Fizz");
		else if (num%5==0) System.out.println("Buzz");
		else System.out.println("Not divisible by 3 - 5");

	}

}
