package test;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		if (num1 < num2) System.out.println("Num2 "+num2+" is geater");
		else System.out.println(num1+" is greater,");

	}

}
