package Nalin_logic_builds;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		int check = 1;
		
		while(num>0) {
			
			num -= check;
			check+=2;
			
		}
		//System.out.println(check);
		if (num== 0) {
			System.out.println("Its a prime number");
			
		}
		else System.out.println("Not a prime number");

	}

}
