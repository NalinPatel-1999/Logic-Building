package test;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		int age = scr.nextInt();
		
		if (age >=18)System.out.println("Eligible to vote");
		else System.out.println("No eligible to vote");

	}

}
