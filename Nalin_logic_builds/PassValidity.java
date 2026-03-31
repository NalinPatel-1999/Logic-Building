package Nalin_logic_builds;

import java.util.Scanner;

public class PassValidity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner (System.in);
		
		String pass = scr.next();
		
		if(pass.length()<8) {
			System.out.println("Pass word lenght must be greater than 8 character");
		}
		else System.out.println("Correct pass");

	}

}
