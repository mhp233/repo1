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
			System.out.println("�����û���");
			logname=sc.next();
			if(logname.equals(name)){
				System.out.println("���������� ��"+times+"�λ��᣺");	
				psw=sc.nextInt();
				if(psw==pass){
					System.out.println("������ȷ���Ϸ�������");
					break;
				}else{
					times--;
					System.out.println("�������");
				}
				if(times==0){
					break;
				}
			}
		}while(true);
//3�λ���
//		System.out.println("���������� �����λ��᣺");
//		int i,psw=0;
//		for ( i=0;i<3;i++ ){
//			System.out.println("���룺");
//			psw=sc.nextInt();
//			if(psw==pass){
//				System.out.println("������ȷ���Ϸ�������");
//				break;
//			}else{
//				times--;			
//				System.out.println("�������ʣ�������"+times);
//			}
//		}
		//��¼���û��� ��ȷ����������   �ӵ�������
	}

}
