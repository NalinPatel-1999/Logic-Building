package Nalin_logic_builds;

import java.util.Scanner;

public class CalcThirdAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int a1 = scr.nextInt();
		int a2  = scr.nextInt();
		
		if (a1 > 0 && a2 > 0 && a1+a2 <180)System.out.println(180 - (a1+a2)); 
		else System.out.println("The given angles can not form a trianlge");

	}

}
