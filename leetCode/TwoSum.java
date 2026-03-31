package leetCode;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num [ ]= {11,7,2,5};
		
		System.out.println(Arrays.toString(twoSum(num, 9)));

	}
	
	public static int [] twoSum(int [] nums, int target) {
		
		HashMap <Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i< nums.length; i++) {
			
			int result = target - nums[i];
			
			if(map.containsKey(result)) {
				
				return new int [] {(int) map.get(result), i};
			}
			
			map.put(nums[i], i);
		}
		
		return new int[] {};
	}

}
