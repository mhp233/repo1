package test0610;
//˫��ѭ�� �ڲ���Ƹ��� ���������� 
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=1;i<5;i++){
			for(int j=1;j<5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++){
			for(int j=1;j<=(2*i-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
