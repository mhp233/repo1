package classwork2_password;

import java.util.Scanner;

public class ChangePsw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String old,n;
		Password psw=new Password();
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("请输入旧的密码：");
			old=sc.next();
			System.out.println("请输入新的密码：");
			n=sc.next();
		}while(psw.change(old, n));
		

	}

}
