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
			System.out.println("������ɵ����룺");
			old=sc.next();
			System.out.println("�������µ����룺");
			n=sc.next();
		}while(psw.change(old, n));
		

	}

}
