package test0610;

import java.util.Arrays;
//arrays数组工具类
/*
 * arrays.sort(数组 )/（数组，0，4）升序
 * arrays.fill(数组，数，0，4)
 */
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nums[] = {55,4,37,89,1};
		Arrays.sort(nums);
		for(int n :nums){
			System.out.print(n+" ");
			
		}
	}

}
