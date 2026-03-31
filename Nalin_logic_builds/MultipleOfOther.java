package Nalin_logic_builds;

import java.util.Scanner;

public class MultipleOfOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		int num1 = scr.nextInt();
		int num2 = scr.nextInt();
		
		if(num1<num2) {
			if (num2%num1==0) System.out.println(num1+" is multiplier of "+num2);
			else System.out.println("Not a multiplier");
		}
		else {
			if (num1%num2==0) System.out.println(num2+" is multiplier of "+num1);
			else System.out.println("Not a multiplier");
			
		}
		
		

	}

}
