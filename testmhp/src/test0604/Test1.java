package test0604;

import java.util.Scanner;

//百米赛跑10秒以内的同学有资格进入决赛，根据性别分别进入男组或者女组
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("输入成绩和性别");
		double sec = s.nextDouble();
		String sex = s.next();
		if (sec<10){
			if(sex.equals("男")){
				System.out.println("男组决赛");
			}else if(sex.equals("女")){
				System.out.println("女组决赛");
			}else{
				System.out.println("性别信息错误");
			}
		}else{
			System.out.println("没有进入决赛");
		}
		
	}

}
