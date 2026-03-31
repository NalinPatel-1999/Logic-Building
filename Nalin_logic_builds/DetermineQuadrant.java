package Nalin_logic_builds;

import java.util.Scanner;

public class DetermineQuadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int x = scr.nextInt();
		int y = scr.nextInt();
		
		if (x>0 && y > 0) System.out.println("Q1");
		else if (x<0 && y > 0) System.out.println("Q2");
		else if (x<0 && y < 0) System.out.println("Q3");
		else if (x>0 && y < 0) System.out.println("Q4");
		else System.out.println("O");

	}

}
