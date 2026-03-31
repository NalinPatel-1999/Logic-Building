package Nalin_logic_builds;

import java.util.Scanner;

public class DetermineDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int day = scr.nextInt();
		
		if (day<1 || day >7) {System.out.println("Invalid value entered"); return;}
		
		if (day ==6 || day == 7)System.out.println("Its weekend");
		else System.out.println("Working day");

	}

}
