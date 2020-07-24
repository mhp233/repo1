package test0612;

import java.util.Scanner;

//dvd 借出和归还 名称日期    归还 名称日期  借金 

public class Test_dvd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choose=0;
		int c,i=0;
		boolean bl=false;
//初始化dvd信息  声明数组存dvd信息
		String dvdname[]=new String[6];
		int status[] = new int [6];//0为可借 1为已借出
		int date[]=new int [6];//借出天数
		int count[]=new int [6];//借出次数
		dvdname[0]="a";
		dvdname[1]="b";
		
		 do {
			i=0;
			System.out.println("DVD借还系统，请选择功能！\n"
					+ "**********************************\n"
					+ "1.新增dvd\n"
					+ "2.查看dvd\n"
					+ "3.删除dvd\n"
					+ "4.借出dvd\n"
					+ "5.归还dvd\n"
					+ "6.推出dvd\n"
					+ "**********************************\n"
					+ "请输入选项:\n");
			choose=sc.nextInt();//输入选项进入switch
			switch(choose){
				case 1:
					System.out.println("-->新增DVD\n\n"
							+ "请输入要新增的DVD名字:");
					String add;
					add=sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(dvdname[i]==null) {
							dvdname[i]=add;
							System.out.println("序号 名称："+i+dvdname[i]);
							System.out.println("新增成功");
							break;
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("新增失败，没有空位");
					}
					break;
				case 2:
					System.out.println("-->查看DVD\n\n");
					System.out.println("序号\t状态\t名称\t借出天数\t借出次数");
					for(i=0;i<dvdname.length;i++) {
						if(dvdname[i]!=null) {
							String dvdstatus= status[i]==0?"可借阅":"已借出";
							String data= date[i]==0?"":date[i]+"日";
							System.out.println((i+1)+"\t"+dvdstatus+"\t"+dvdname[i]+"\t"+data+"\t"+count[i]);
						}		
					}
					break;
				case 3:
					System.out.println("-->删除DVD\n\n");
					System.out.println("请输入DVD名字：");
					String delname =sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(delname.equals(dvdname[i])) {
							if(status[i]==0) {
								dvdname[i]=null;
								System.out.println("删除成功");	
							}else {
								System.out.println("此DVD已经借出，请待归还后删除。");
							}
							
							break;
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("删除目标没有记录 失败");
					}
					break;
				case 4:
					System.out.println("-->借阅dvd");
					System.out.println("请输入借阅DVD名字，天数");
					int bd=0;
					String bn;
					bn=sc.next();
					bd=sc.nextInt();
					for(i=0;i<dvdname.length;i++) {
						if(bn.equals(dvdname[i])) {
							if(status[i]==0) {
								status[i]=1;
								date[i]=bd;
								count[i]++;	
							}else {
								System.out.println("此dvd已经借出");
							}
							
							break;
						}
					}
					if(i==dvdname.length) {
						System.out.println("无此dvd 借阅失败");
					}
					break;
				case 5:
					System.out.println("-->归还dvd");
					System.out.println("请输入归还DVD名称");
					String name;
					name=sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(name.equals(dvdname[i])) {
							if(status[i]==0) {
								status[i]=0;
								System.out.println("请输入归还天数：");
								int date2=sc.nextInt();
								System.out.println("借阅天数："+date[i]+"\n归还天数："+date2+"\n应付金额："+5*(date2-date[i]));		
								date[i]=0;	
								break;
							}else {
								System.out.println(dvdname[i]+"，此dvd没有被借");
								break;
							}
							
							
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("归还失败");
					}
					break;
				case 6:
					bl=false;
					System.out.println("系统已退出");
					return;
				default:
					System.out.println("选项错误 请重新选择请输入 ，1-6！");
			}
			    
			
				System.out.println("是否继续，输入1继续 ，0退出");//询问是否继续
			    c=sc.nextInt();
			    if(c==1) {
			    	bl=true; 
			    }
		}while(bl); 
		System.out.println("\n结束，系统已退出！");
	}

}
