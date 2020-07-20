package mhp714;

import java.util.Scanner;

public class Test0602mhp 
{

	public static void main(String[] args)
	{
//canner	输入	0201 0202
Scanner s= new Scanner(System.in);
System.out.println("请输入数字 字符串 还有double");
     int a=s.nextInt();
     String b=s.next();
     double c=s.nextDouble();
     boolean d =false;
     System.out.println(d);
     //变量0203
			//变量类型 变量名 = 变量值;
			//同一个作用域里，不能有两个同名变量
     char e;
     e='e';
     e='好';
	//运算符+-*/%求余0204
     int a1=5,a2=6;
	System.out.println(a1+a2);
	System.out.println(a1-a2);
	System.out.println(a2%a1);
	
/*0205
 * 比较运算符
 * <><= >= == !=
 * 结果是布尔类型
 */
	System.out.println(a1>a2);
/*
 * 数据类型转换0206
 *
 * 
 */
	int a3=10;
	double a4=a3;
	//自动转换a3的值转成double赋给a4 由小转大
	
	int a5 =(int) a4;
	//大转小强制转换
	System.out.println(a5);
	System.out.println(a4);
	}
}
