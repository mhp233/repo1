package test0604;

import java.util.Scanner;

//.hasnextint�ж��Ƿ���һ����  ����ֵ�ǲ�������
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        if(s.hasNextInt()){
        	int mum = s.nextInt();
        	System.out.println(mum);
        }else{
        	System.out.println("����������");
        }
	}

}
