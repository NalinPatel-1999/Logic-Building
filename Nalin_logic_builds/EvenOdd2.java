package Nalin_logic_builds;

import java.util.Scanner;

public class EvenOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		if (num1%2==0 && num2%2==0) {

				System.out.println("Both are even numbers");
		}
		else if (num1%2==0) {
			System.out.println(num1+" is even and "+num2+" is odd");
		}
		else if(num2%2==0) {
			System.out.println(num2+" is even and "+num1+" is odd");
		}
		else System.out.println("Both are odd");

	}

}
