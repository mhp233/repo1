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
			System.out.println("请输入客人信息，年龄和岁数");
			c1.setcus(sc.next(), sc.nextInt());
			c1.ticket();
			System.out.println("是否继续，请输入true或false");
			if(sc.hasNextBoolean()){
				bl=sc.nextBoolean();
			}else{
				System.out.println("错位，退出");
				bl=false;
			}
		}while(bl);
				

	}

}
