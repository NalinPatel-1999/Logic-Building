package Nalin_logic_builds;

import java.util.Scanner;

public class IsVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		char ch = scr.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			    System.out.println(ch + " is a vowel");
			} else {
			    System.out.println(ch + " is a consonant");
			}
		

	}

}
