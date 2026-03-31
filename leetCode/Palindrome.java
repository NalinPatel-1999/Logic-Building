package leetCode;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int originNum = 121;
		int num = originNum;
		int result = 0;
		
		while (num>0) {
			
			result= result *10 + num%10;
			num=num/10;
			
		}
		
		
		if( result ==originNum  ) {
			System.out.println("equal");
		}
		else System.out.println("Not equal");
		
		
	}

}
