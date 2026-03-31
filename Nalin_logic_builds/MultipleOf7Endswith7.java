package Nalin_logic_builds;

import java.util.Scanner;

public class MultipleOf7Endswith7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		if(num%10==7 && num%7 == 0) System.out.println("Number is a multiple of 7 and ends with 7");
		else System.out.println("Condition not match");

	}

}
