package Nalin_logic_builds;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int digit = scr.nextInt();
		if(digit<0) digit*=-1;
		int check = 0;
		
		while(digit > 0) {
			
			check++;
			digit/=10;
			
			if(check>=3)break;
			
		}
		
		if (check >=3) System.out.println("Multiple Digit");
		else if (check ==2) System.out.println("Double Digit");
		else System.out.println("Single Digit");

	}

}
