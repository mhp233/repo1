package test0605;
//输出0-100的偶数 偶数和
public class Test2 {
	public static void main(String[] args) {
		int a=0;
		while (a<=100){
			System.out.println(a);
			a=a+2;
		}//偶数
		System.out.println("偶数和");
		a=0;
		int b=0;
		while(a<=100){
			b=b+a;
			
			a=a+2;
			
		}
		System.out.println(b);//偶数和
	}
}
