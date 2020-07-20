package test0610;

import java.util.Scanner;

//输入两个班级 每班有5人 记录平均分    数组
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("请输入a班所有人成绩");
		int aa[] =new int[5];
		int bb[] =new int[5];
		int a=0,b=0;//两班平均分
		for(int i=0;i<5;i++){
		     aa[i]=sc.nextInt();
		     a=a+aa[i];
		}
		
		System.out.println("请输入b班所有人成绩");
		for(int i=0;i<5;i++){
		     bb[i]=sc.nextInt();
		     b=b+bb[i];
			}
		
		
		System.out.println("ab班平均成绩分别为"+a/aa.length+" "+b/bb.length);
	}

}
