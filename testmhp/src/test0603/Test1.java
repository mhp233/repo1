package test0603;

import java.util.Scanner;

//流程控制if else    
public class Test1 {
	

	public static void main(String[] args) {
	Scanner s =new Scanner (System.in);	
	int score;
	System.out.println("请输入分数");
	score=s.nextInt();
		if (score>90){
			System.out.println("奖励手机");
		
		}else{
			System.out.println("学习");
		}
	}

}
