package test0603;

import java.util.Scanner;

//多个流程 if elseif
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score;
		Scanner s= new Scanner(System.in);
		System.out.println("请输入分数");
		score=s.nextInt();
		if (score>=90){
			System.out.println("奖励手机");
		}else if(score>=60){
			System.out.println("play");
		}else{
			System.out.println("study");
		}

	}

}
