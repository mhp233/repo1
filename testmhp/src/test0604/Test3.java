package test0604;

import java.util.Scanner;

//135�Ͽ� 246��Ϣ  7��ϰ case����
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch(day){
        	case 2:
        	case 4:
        	case 6:
        		System.out.println("�Ͽ�");
        	    break ;
        	case 1:
        	case 3:
        	case 5:
        		System.out.println("��ϰ");
        	    break ;
        	case 7:
        		System.out.println("��Ϣ");
        	default :
        		System.out.println("��������");
        }
	}

}
