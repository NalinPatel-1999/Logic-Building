package test;

import java.util.Scanner;

public class CharPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
		char input =  scr.next().charAt(0);
		
		if (input >='a' && input <= 'm') System.out.println("Lies between a and m");
		else if (input >='n' && input <= 'z') System.out.println("Lies between n and z");
		else System.out.println("Entered invalid character per condition");
		

	}

}
