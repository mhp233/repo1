package test0605;
//1.输出1-100的值
		//2.输出1-100中的偶数
		//3.输出1-100中的偶数和
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//1 输出1到100
		int i,s=0;
		for(i=1;i<=100;i++){
			System.out.println(i);
		}
//2 输出1-100中的偶数
		for( i=2;i<=100;i=i+2){
			System.out.println(i);
		}
//3 输出1到100的偶数和
		for( i=2;i<=100;i=i+2){
			s=s+i;
		}
	
		System.out.println(s);
	
	
	}
	

}
