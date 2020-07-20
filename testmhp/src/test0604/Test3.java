package test0604;

import java.util.Scanner;

//135上课 246休息  7自习 case叠加
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
        		System.out.println("上课");
        	    break ;
        	case 1:
        	case 3:
        	case 5:
        		System.out.println("自习");
        	    break ;
        	case 7:
        		System.out.println("休息");
        	default :
        		System.out.println("输入有误");
        }
	}

}
