package test0603;
//���� && || ��
import java.util.Scanner;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java>98 yinyue>80 ���� ����>70java 100
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("������ java �����ֵĳɼ�");
		a=s.nextInt();
		b=s.nextInt();
		if((a>98)&&(b>80)||((a==100)&&(b>70))){
			System.out.println("����");
		}else{
			System.out.println("�ͷ�");
		}
	}

}
