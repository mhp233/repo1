package test0603;

import java.util.Scanner;

//������� if elseif
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int score;
		Scanner s= new Scanner(System.in);
		System.out.println("���������");
		score=s.nextInt();
		if (score>=90){
			System.out.println("�����ֻ�");
		}else if(score>=60){
			System.out.println("play");
		}else{
			System.out.println("study");
		}

	}

}
