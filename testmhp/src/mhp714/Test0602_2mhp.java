package mhp714;

public class Test0602_2mhp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//��Ŀ�����0207   3>2?1:2 3>2Ϊ�� ֵΪһ  ����ֵΪ2
		System.out.println("��Ŀ����");
		System.out.println(3>2?1:2 );
		System.out.println(2>3?1:2 );
//++ -- 0208
		System.out.println("++ ��--");
		int a1 =9;
		int a2 =a1++;
		a1 =9;
		int a3 =++a1;
		System.out.println(a2);
		System.out.println(a3);
		
//���������� ������ֵ0209
		System.out.println("���������� ������ֵ");
		int b1=2;
		int b2=20;
		int b3;
		b3=b1;
		b1=b2;
		b2=b3;
		System.out.println(b1);
		System.out.println(b2);   
	}
	
}
