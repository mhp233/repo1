package test0604;

import java.util.Scanner;

//.hasnextint判断是否是一个数  返回值是布尔类型
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
        	System.out.println("请输入数字");
        }
	}

}
