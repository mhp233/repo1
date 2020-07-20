package test0610;

import java.util.Arrays;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = {55,4,37,89,1};
		Arrays.sort(nums);
		//1 4 37 55 89
		for(int i = nums.length-1;i>=0;i--){
			System.out.print(nums[i]+"\t");
		}
		
		System.out.println();
		
		for(int i = 0;i<nums.length;i++){
			System.out.print(nums[nums.length-1-i]+"\t");
		}
	}

}
