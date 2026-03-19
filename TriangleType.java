package test;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		float s1 = scr.nextFloat();
		float s2 = scr.nextFloat();
		float s3 = scr.nextFloat();
		
		if (s1==s2 && s2==s3 && s3==s1) System.out.println("Equilater");
		else if (s1==s2 || s2==s3 || s3==s1) System.out.println("Isosceles");
		else System.out.println("Scalene");

	}

}
