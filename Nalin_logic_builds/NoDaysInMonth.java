package Nalin_logic_builds;

import java.util.Scanner;

public class NoDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int month = scr.nextInt();
		
		switch (month) {
	    // Cases for 31 Days
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12:
	       System.out.println("31 Days.");
	        break;

	    // Cases for 30 Days
	    case 4:
	    case 6:
	    case 9:
	    case 11:
	    	System.out.println("30 Days.");
	        break;

	    // Case for 28/29 Days
	    case 2:
	    	System.out.println("28/29 Days.");
	        break;

	    default:
	    	System.out.println("Invalid Month.");
	        break;
	    }

	}

}
