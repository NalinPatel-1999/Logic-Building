package Nalin_logic_builds;

import java.util.Scanner;

public class MidDigitVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		int first = num%10;
		num/=10;
		
		int mid = num%10;
		num/=10;
		
		int last = num%10;
		
		if(mid<first && mid < last)System.out.println("It is the Smallest");
		else if(mid>first && mid >last)System.out.println("Largest");
		else System.out.println("Niether");
	}

}
