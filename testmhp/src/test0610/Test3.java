package test0610;

import java.util.Scanner;

//5门成绩 80分以上的成绩有几门
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b=0;
		double avg[]=new double[5];
		for(int i=0;i<5;i++){
			a=sc.nextDouble();
			if(a>=80){
				avg[(int) b]=a;
				b++;
			}
			
		}
		System.out.println("有"+b+"门课高于八十：");
		for(int i=0;i<b;i++){
			System.out.println(avg[i]);
		}
	} 

}
