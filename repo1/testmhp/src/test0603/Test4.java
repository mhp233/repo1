package test0603;

import java.util.Scanner;

//判断文本是否相等用equals   if(a.equals(b))
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		Scanner s=new Scanner(System.in);
		String ans =s.next();
       if(ans.equals("合格")){
    	   System.out.println("合格了");
       }else if(ans.equals("不合格")){
    	   System.out.println("不合格");
       }
	}

}
