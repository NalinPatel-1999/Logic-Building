package Nalin_logic_builds;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		float s1 = scr.nextFloat();
		float s2 = scr.nextFloat();
		float s3 = scr.nextFloat();
		
		if (s1<0 || s2< 0 || s3< 0) {
			System.out.println("The side can not be negative");
			return;
		}
		
		if (s1+s2 > s3 && s2+s3 > s1 && s3+s1 > s2) System.out.println("Its a valid triangle");
		else System.out.println("Not a valid triangle");

	}

}
