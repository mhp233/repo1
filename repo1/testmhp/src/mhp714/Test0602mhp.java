package mhp714;

import java.util.Scanner;

public class Test0602mhp 
{

	public static void main(String[] args)
	{
//canner	����	0201 0202
Scanner s= new Scanner(System.in);
System.out.println("���������� �ַ��� ����double");
     int a=s.nextInt();
     String b=s.next();
     double c=s.nextDouble();
     boolean d =false;
     System.out.println(d);
     //����0203
			//�������� ������ = ����ֵ;
			//ͬһ�������������������ͬ������
     char e;
     e='e';
     e='��';
	//�����+-*/%����0204
     int a1=5,a2=6;
	System.out.println(a1+a2);
	System.out.println(a1-a2);
	System.out.println(a2%a1);
	
/*0205
 * �Ƚ������
 * <><= >= == !=
 * ����ǲ�������
 */
	System.out.println(a1>a2);
/*
 * ��������ת��0206
 *
 * 
 */
	int a3=10;
	double a4=a3;
	//�Զ�ת��a3��ֵת��double����a4 ��Сת��
	
	int a5 =(int) a4;
	//��תСǿ��ת��
	System.out.println(a5);
	System.out.println(a4);
	}
}
