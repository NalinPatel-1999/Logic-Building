package Nalin_logic_builds;

import java.util.Scanner;

public class GoodWishes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		int time = scr.nextInt();
		
		if (time<0 || time >23) {
			System.out.println("Invalid time entered - "+time);
			return;
		}
		
		if (time>= 0 && time <= 12)System.out.println("GM");
		else if (time>12 && time <=16) System.out.println("GA");
		else if (time>16 && time <=20) System.out.println("GE");
		else System.out.println("GN");

	}

}
