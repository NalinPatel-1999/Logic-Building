package Nalin_logic_builds;

import java.util.Scanner;

public class NumberText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		short num = scr.nextShort();
		
		if (num/10 > 0) {
			System.out.println("Multi digit number entered, please enter single digit");
			return;
		}
		
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;

		default:
			System.out.println("Entered Negative value");
			break;
		}

	}

}
