package test0610;

import java.util.Scanner;

//5�ųɼ� 80�����ϵĳɼ��м���
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
		System.out.println("��"+b+"�ſθ��ڰ�ʮ��");
		for(int i=0;i<b;i++){
			System.out.println(avg[i]);
		}
	} 

}
