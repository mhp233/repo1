package test0603;

import java.util.Scanner;

//�ж��ı��Ƿ������equals   if(a.equals(b))
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		Scanner s=new Scanner(System.in);
		String ans =s.next();
       if(ans.equals("�ϸ�")){
    	   System.out.println("�ϸ���");
       }else if(ans.equals("���ϸ�")){
    	   System.out.println("���ϸ�");
       }
	}

}
