package test0604;

import java.util.Scanner;

//switch caseÇé¿öÆ¥ÅäÊ§°Ü Æ¥ÅäÎªdefault 
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ÊäÈë¿¼ÊÔÃû´Ê");
		int score = s.nextInt();
		switch(score){
		case 1:
			System.out.println("computer");
			break;
		case 2:
			System.out.println("phone");
			break;
		case 3:
			System.out.println("play");
			break;
		default:
			System.out.println("study");
		}
	}

}
