package test0610;

import java.util.Scanner;

//���������༶ ÿ����5�� ��¼ƽ����    ����
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("������a�������˳ɼ�");
		int aa[] =new int[5];
		int bb[] =new int[5];
		int a=0,b=0;//����ƽ����
		for(int i=0;i<5;i++){
		     aa[i]=sc.nextInt();
		     a=a+aa[i];
		}
		
		System.out.println("������b�������˳ɼ�");
		for(int i=0;i<5;i++){
		     bb[i]=sc.nextInt();
		     b=b+bb[i];
			}
		
		
		System.out.println("ab��ƽ���ɼ��ֱ�Ϊ"+a/aa.length+" "+b/bb.length);
	}

}
