package Nalin_logic_builds;

import java.util.Scanner;

public class MedianVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int a = scr.nextInt();
		int b = scr.nextInt();
		int c = scr.nextInt();
		
		if ((a<=b && a>=c) || (a>=b && a<=c) )System.out.println(a);
		else if ((b<=a && b >=c)||(b >=a && b <= c)) System.out.println(b);
		else System.out.println(c);

	}

}
