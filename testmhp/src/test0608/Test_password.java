package test0608;

import java.util.Scanner;

public class Test_password {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String name = "admin";
		String logname;
		int pass = 123456;int psw = 0;
		int times=3;
		do{
			System.out.println("输入用户名");
			logname=sc.next();
			if(logname.equals(name)){
				System.out.println("请输入密码 有"+times+"次机会：");	
				psw=sc.nextInt();
				if(psw==pass){
					System.out.println("密码正确，老伏拉夫了");
					break;
				}else{
					times--;
					System.out.println("密码错误");
				}
				if(times==0){
					break;
				}
			}
		}while(true);
//3次机会
//		System.out.println("请输入密码 有三次机会：");
//		int i,psw=0;
//		for ( i=0;i<3;i++ ){
//			System.out.println("密码：");
//			psw=sc.nextInt();
//			if(psw==pass){
//				System.out.println("密码正确，老伏拉夫了");
//				break;
//			}else{
//				times--;			
//				System.out.println("密码错误，剩余次数："+times);
//			}
//		}
		//先录入用户名 正确则输入密码   加到上面了
	}

}
