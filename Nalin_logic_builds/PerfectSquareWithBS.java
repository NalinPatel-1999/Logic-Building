package Nalin_logic_builds;

import java.util.Scanner;

public class PerfectSquareWithBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		int n = scr.nextInt();
		
		long left = 1, right = n,square=-1;
		

        while (left <= right) {
        	
            long mid = left + (right - left) / 2;
            //System.out.println("Mid - "+mid);
            square = mid * mid;
            //System.out.println(9/2 +"-- "+13/2);
           // System.out.println("L - "+left+" R - "+right+"Mid - "+mid+" SQR - "+square);

            if (square == n) {
                //return true; // 
            	//System.out.println("Found it!");
            	break;
            } else if (square < n) {
                left = mid + 1; // Look higher
            } else {
                right = mid - 1; // Look lower
            }
        }
        
        if (square == n) {
            
        	System.out.println("Perfect Square");
        	
        } else System.out.println("Not a Perfect Square");
        
        

	}

}
