package test0610;

import java.util.Arrays;
//arrays���鹤����
/*
 * arrays.sort(���� )/�����飬0��4������
 * arrays.fill(���飬����0��4)
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
