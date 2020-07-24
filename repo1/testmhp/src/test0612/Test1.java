package test0612;

import java.util.Arrays;
import java.util.Scanner;

//二维数组 输入两个班 每个班5人的成绩
public class Test1 {

	public static void main(String[] args) {
		int[][] score=new int[2][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println("请输入第"+(i+1)+"班的"+(j+1)+"个成绩");
				score[i][j]=sc.nextInt();
			}
		}	
		System.out.println(Arrays.deepToString(score));
	}

}
