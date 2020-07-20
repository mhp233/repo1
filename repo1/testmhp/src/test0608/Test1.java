package test0608;
//do while输出1到100；do while输出1到100中7的倍数之和
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		do{
			System.out.println(i);
			i++;
			
		}while(i<=100);
		i=1;
		do{
			if(i%7==0){
				sum=sum+i;
				System.out.println(i);
			}
			i++;
		}while(i<=100);
		System.out.println("100内7的倍数之和为："+sum);
	}

}
