package mhp714;

public class Test0602_2mhp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//三目运算符0207   3>2?1:2 3>2为真 值为一  假则值为2
		System.out.println("三目运算");
		System.out.println(3>2?1:2 );
		System.out.println(2>3?1:2 );
//++ -- 0208
		System.out.println("++ 和--");
		int a1 =9;
		int a2 =a1++;
		a1 =9;
		int a3 =++a1;
		System.out.println(a2);
		System.out.println(a3);
		
//两个数互换 用三个值0209
		System.out.println("两个数互换 用三个值");
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
