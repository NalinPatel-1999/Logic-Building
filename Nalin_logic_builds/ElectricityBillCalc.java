package Nalin_logic_builds;

import java.util.Scanner;

public class ElectricityBillCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int unit = scr.nextInt();
		float billAmount = 0.0f;
		
		if (unit==0) {
			System.out.println(billAmount+" Rs. "); return;
		}
		
		if (unit<0) {
			System.out.println("Units can't be negative (-)");
		}
		
		if(unit<=100) {
			billAmount = unit*4;
			 System.out.println(billAmount+" Rs. Bill for unit "+unit);
		}
		else if (unit>100) {
			
			int temp_unit = unit-100;
			System.out.println(temp_unit);
			billAmount = 400 + temp_unit*6;
			
			if(unit>300) {
				
				temp_unit = unit- 300;
				System.out.println(temp_unit);
				billAmount= 400+ 1200 + (temp_unit*8);
			}
			
			System.out.println(billAmount);
		}

	}

}
