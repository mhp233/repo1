package test0608;
//do while���1��100��do while���1��100��7�ı���֮��
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
		System.out.println("100��7�ı���֮��Ϊ��"+sum);
	}

}
