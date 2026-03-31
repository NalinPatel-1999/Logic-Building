package Nalin_logic_builds;

import java.util.Scanner;

public class ThreeDistinctDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int num = scr.nextInt();
		
		//System.out.println(num%10);
		//System.out.println(num/10);
		
		boolean check = true;
		int val = num%10;
		//num = num/10;
		
		while(num>0) {
			
			
			if(num%10 != val) {
				check = false; 
			break;}
			 
			num = num/10;

		}
		 
		if(check) System.out.println("All digits are Identical");
		else System.out.println("Not Identical");

	}

}
