package Nalin_logic_builds;

import java.util.Scanner;

public class decideGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
		float marks = scr.nextFloat();
		
		if (marks<0 || marks >100) {
			System.out.println("Invalid entry, marks can not be - "+marks);
			return;
		}
		
		if(marks>=0 && marks<33) System.out.println("F");
		else if (marks>=33 && marks<=45) System.out.println("D");
		else if (marks>=46 && marks<=55) System.out.println("C");
		else if (marks>=56 && marks<=70) System.out.println("B");
		else if (marks>=71 && marks<=100) System.out.println("A");

	}

}
