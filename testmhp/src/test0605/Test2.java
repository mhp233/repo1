package test0605;
//���0-100��ż�� ż����
public class Test2 {
	public static void main(String[] args) {
		int a=0;
		while (a<=100){
			System.out.println(a);
			a=a+2;
		}//ż��
		System.out.println("ż����");
		a=0;
		int b=0;
		while(a<=100){
			b=b+a;
			
			a=a+2;
			
		}
		System.out.println(b);//ż����
	}
}
