package test;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int inputYear = scr.nextInt();
		
		if (inputYear % 4 == 0 && (inputYear%100 != 0 || inputYear%400==0)) System.out.println("The year is leap year");
		else System.out.println("Not a leap year");

	}

}
