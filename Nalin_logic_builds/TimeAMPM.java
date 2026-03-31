package Nalin_logic_builds;

import java.util.Scanner;

public class TimeAMPM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int hours = scr.nextInt();
		int minutes = scr.nextInt();
		
		 if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
		        System.out.println("Invalid Time");
		        return;
		    }

		    if (hours >= 12) {
		    	System.out.println("PM");
		    } else {
		    	System.out.println("AM");
		    }

	}

}
