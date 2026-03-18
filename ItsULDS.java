package test;

import java.util.Scanner;

public class ItsULDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		char input = scr.next().charAt(0);
		
		if (input >='A' && input <='Z') System.out.println(input+" Input is Upper case");
		else if (input>= 'a' && input<='z') System.out.println(input+" Input is lower case");
		else if (input >= '0' && input <= '9') System.out.println(input+" Input is a number");
		else System.out.println(input+ " Input is a special character");

	}

}
