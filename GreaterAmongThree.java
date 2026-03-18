package test;

import java.util.Scanner;

public class GreaterAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		int num3 = scr.nextInt();
		
		if (num1>num2) {
			
			if(num1>num3) System.out.println(num1+" Num1 is greater");
		}
		else if (num2>num3) {
			
			System.out.println(num2+" num2 is greater.");
		}
		else System.out.println(num3+" num3 is greater.");

	}

}
