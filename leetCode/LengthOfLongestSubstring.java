package leetCode;

import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(distinctSubstring("abcabcbb"));
	}
	
	public static int distinctSubstring(String s) {
		
		HashMap<Character, Integer> map = new HashMap();
		
		
		int max_len = 0;
		int left = 0;
		
		for (int right = 0; right<s.length(); right++) {
			 char current = s.charAt(right);
			if(map.containsKey(current)) {
				
				//System.out.println("if - "+current +" - L-  "+ left+" - R - "+right+"  ml - "+max_len + "- "+map.get(current));
				
				left = Math.max(left, map.get(current)+1);
			}
			
			map.put(current, right);
			//System.out.println(current +" - L-  "+ left+" - R - "+right+"  ml - "+max_len);
			max_len = Math.max(max_len, right-left+1);
			System.out.println(current +" - L-  "+ left+" - R - "+right+"  ml - "+max_len);
		}
		
		return max_len;
	
	}
		
		


}
