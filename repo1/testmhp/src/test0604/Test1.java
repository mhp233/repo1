package test0604;

import java.util.Scanner;

//��������10�����ڵ�ͬѧ���ʸ��������������Ա�ֱ�����������Ů��
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("����ɼ����Ա�");
		double sec = s.nextDouble();
		String sex = s.next();
		if (sec<10){
			if(sex.equals("��")){
				System.out.println("�������");
			}else if(sex.equals("Ů")){
				System.out.println("Ů�����");
			}else{
				System.out.println("�Ա���Ϣ����");
			}
		}else{
			System.out.println("û�н������");
		}
		
	}

}
