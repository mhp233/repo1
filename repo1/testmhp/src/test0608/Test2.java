package test0608;

import java.util.Scanner;

/**
 * ����ѭ��do while ������һ�����ж� �������Ƚ����ж�
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
			System.out.println("д��ҵ");
			System.out.println("�������");
			ans = input.next();
			
		}while(!"y".equals(ans));
		for(int i=0;i<50;i++){
			System.out.println("��Ȧ��������"+(i+1));
		}
	}

}
