package leetCode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lSWRC("pwwkew"));
	}
	
	public static String lSWRC(String s) {
		
		//abcabcbb - o - 3
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int left = 0;
		int start = 0;
		
		int result = 0;
		for(int right = 0; right<s.length();right++) {
			char current = s.charAt(right);
			if(map.containsKey(current)) {
				//left +=1;
				
				left = Math.max(left, map.get(current)+1);
				//if(res.length()!=result) res="";
			}
			//System.out.println("L - "+left+" rght - "+right+" res - "+result );
			map.put(current, right);
			//System.out.println(map);
			//result = Math.max(result,  right-left+1);
			if(right-left+1 >result) {
				result = right-left+1;
				start = left;
			}
			//System.out.println(s.substring(start, start+result) + " s -"+start+" end "+ (start+result));

			
		}
				return s.substring(start, start+result);
	}

}
