package classWork1_ticket;

import java.util.Scanner;
public class Sell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean bl=true;
		Customer c1=new Customer();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("�����������Ϣ�����������");
			c1.setcus(sc.next(), sc.nextInt());
			c1.ticket();
			System.out.println("�Ƿ������������true��false");
			if(sc.hasNextBoolean()){
				bl=sc.nextBoolean();
			}else{
				System.out.println("��λ���˳�");
				bl=false;
			}
		}while(bl);
				

	}

}
