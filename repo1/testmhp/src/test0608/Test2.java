package test0608;

import java.util.Scanner;

/**
 * 三种循环do while 是先做一次在判断 其他是先进行判断
 * 
 * @author 25076
 *
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ans="y";
		do{
			System.out.println("写作业");
			System.out.println("完成了吗");
			ans = input.next();
			
		}while(!"y".equals(ans));
		for(int i=0;i<50;i++){
			System.out.println("跑圈，次数："+(i+1));
		}
	}

}
