package test0612;

import java.util.Arrays;
import java.util.Scanner;

//��ά���� ���������� ÿ����5�˵ĳɼ�
public class Test1 {

	public static void main(String[] args) {
		int[][] score=new int[2][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println("�������"+(i+1)+"���"+(j+1)+"���ɼ�");
				score[i][j]=sc.nextInt();
			}
		}	
		System.out.println(Arrays.deepToString(score));
	}

}
