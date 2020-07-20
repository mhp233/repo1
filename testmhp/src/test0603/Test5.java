package test0603;
//与或非 && || ！
import java.util.Scanner;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java>98 yinyue>80 奖励 音乐>70java 100
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入 java 和音乐的成绩");
		a=s.nextInt();
		b=s.nextInt();
		if((a>98)&&(b>80)||((a==100)&&(b>70))){
			System.out.println("奖励");
		}else{
			System.out.println("惩罚");
		}
	}

}
