package test;

import java.util.Scanner;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner (System.in);
		
		float temprature = scr.nextFloat();
		
		if (temprature <=15) System.out.println("Cold");
		else if (temprature>15 && temprature <=20) System.out.println("Warm");
		else System.out.println("Hot");

	}

}
