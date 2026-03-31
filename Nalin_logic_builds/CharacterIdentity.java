package Nalin_logic_builds;

import java.util.Scanner;

public class CharacterIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		char ch = scr.next().charAt(0);
		
		if(ch >='0' && ch<='9')System.out.println("Its a digit");
		else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )System.out.println("Its a char");
		else System.out.println("It niether char or digit");

	}

}
