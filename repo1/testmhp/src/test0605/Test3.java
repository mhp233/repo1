package test0605;
//1.���1-100��ֵ
		//2.���1-100�е�ż��
		//3.���1-100�е�ż����
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//1 ���1��100
		int i,s=0;
		for(i=1;i<=100;i++){
			System.out.println(i);
		}
//2 ���1-100�е�ż��
		for( i=2;i<=100;i=i+2){
			System.out.println(i);
		}
//3 ���1��100��ż����
		for( i=2;i<=100;i=i+2){
			s=s+i;
		}
	
		System.out.println(s);
	
	
	}
	

}
