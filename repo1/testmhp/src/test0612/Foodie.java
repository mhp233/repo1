package test0612;

import java.util.Scanner;

//吃货联盟
public class Foodie {

	public static void main(String[] args) {
		int choose=0;//最多接收4组信息
		int k=1;//用于个人订单的菜品序号
		String names[]=new String[4];//订餐人姓名信息
		String dishmsg[] =new String[4];//所选信息 菜品名 份数菜品信息
		int dish[][]=new int[4][5];//存放每个订单的每个菜品数量 比如一号订单就存在 dish[0][],后标0-4对应菜品1-5数量
		int times[]=new int[4];//送餐时间
		String addresses[]=new String[4];//送餐地址
		int states []= new int [4];//订单状态 1表示已预定 2表示已完成
		double sumprice[]=new double [4];//订单总价
		double charge=0;//送餐费
		boolean bl=true;//来调整是否循环系统选项
		boolean bl2=true;//用来
		Scanner sc = new Scanner(System.in);
		int c=1;//存 0 1//判断最后是否退出系统
		int i=0;//表示改存入数组中的哪位
		int j;//用于签收部分
		String dishname[]= {	"蒸羊羔 1999元/只"
				, "蒸熊掌10000元/个"
				, "蒸鹿尾50/份（原料猪肝）"
				, "烧花鸭20元/份"
				, "烧雏鸡19元/份"};//菜单
		int agree[]=new int[5];//记录菜单的点赞数
		int dishprice[]= {1999,10000,50,20,19};//菜品价格 于dishname对应
		do {
				System.out.println("欢迎使用“吃货联盟”订餐系统\n"
				+ "***************************\n"
				+"1、我要订餐\n"
				+"2、查看餐袋\n"
				+"3、签收订单\n"
				+"4、删除订单\n"
				+"5、我要点赞\n"
				+"6、退出系统\n***************************\n请选择：");
				choose=sc.nextInt();
		
				switch(choose) {
					case 1:///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						if(i==5) {
							System.out.println("订单已满，请先删除订单");
							break;
						}
						dishmsg[i]="";
						System.out.println("***我要订餐***");
						System.out.println("请输入姓名：");
						names[i]=sc.next();
						System.out.println("请输入地址：");
						addresses[i]=sc.next();
						System.out.println("请选择要点的菜品\n"
								+ "1-蒸羊羔 1999元/只 "+agree[0]+"赞\n"
								+ "2-蒸熊掌10000元/个 "+agree[1]+"赞\n"
								+ "3-蒸鹿尾50/份（原料猪肝）"+agree[2]+"赞\n"
								+ "4-烧花鸭20元 "+agree[3]+"赞\n"
							    + "5烧雏鸡19元 "+agree[4]+"赞");
						
						do {
							
							int choose2=sc.nextInt();//点的菜品的编号为choose2
							choose2--;
							do {
								if((choose2>=1)&&(choose2<=5)) {
								break;
							}else {
								System.out.println("请重新输入正确的菜品编号");
								
							}
							}while(true);//点菜
							System.out.println("所选菜品");
							System.out.println(dishname[choose2]);
							System.out.println("请输入该菜品分数");
							int x=sc.nextInt();      //菜品数量为x
							dish[i][choose2]+=x;//记录在个人菜品数量的二维数组中 choose2的菜品增加x个
							System.out.println("成功加入");
							sumprice[i]=sumprice[i]+x*dishprice[choose2];
							dishmsg[i]=dishmsg[i]+x+"-"+dishname[choose2]+" ";
							System.out.println("是否继续点餐，1为继续 2为结束");
							if(sc.hasNext()) {
								int ab=sc.nextInt();
								switch(ab) {
								case 1:
									System.out.println("继续点餐");
									break;
								case 2:
									System.out.println("结束点餐");
									bl2=false;
									break;
								default:
									System.out.println("输入错误！请输入数字1或2！本次点餐结束！");
									bl2=false;
								}
							}else {
								System.out.println("输入错误！请输入数字1或2！本次点餐结束！");
								bl2=false;
							}
							
							
						}while(bl2);
						bl2=true;//回正
						do {                                                         
							System.out.println("请输入订餐时间：（**点）10-20点");
							if(sc.hasNext()) {
							    int time=sc.nextInt();
							    if((time<=20)&&(time>=10)) {
							    	times[i]=time;
							    	System.out.println("时间正确！");
							    	break;
							    }
							}else {
								System.out.println("错误！请重新输入数字来表示时间 10-20点 ");
							}
						}while(true);//输入订餐时间部分
						states[i]=1;//1表示订单已预定 2位完成
						if(sumprice[i]<=50) {
							System.out.println("因不满50元,加收5元送餐费" );
							charge=5;
						}
						System.out.println("订餐成功\n"
								+ "您订的菜品：\n"
								+ dishmsg[i]+"\n"
								+ "送餐时间是："+times[i]
								+ "\n餐费："+sumprice[i]+" 送餐费："+charge+"总计："+(sumprice[i]+charge)
								+ "");
						sumprice[i]=sumprice[i]+charge;
						charge=0;
						i++;//表示数组有一个订单 下一个订单存在数组[i]位置
						break;
					case 2:///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***查看餐袋***");
						System.out.println("序号\t订餐人"+"              "+"餐品信息\t订餐时间\t送餐地址\t\t总金额\t订单状态");
						for( j=0;j<i;j++) {
							System.out.println((j+1)+"\t"
									+ names[j]+"              "
									+ dishmsg[j]+"\t"
									+ times[j]+"\t"
									+ addresses[j]+"\t\t"
									+sumprice[j]+"\t"
									+ ((states[j]==1)?"已预定":"已完成")+"\t");//以后改
						}
						break;
					case 3:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***签收订单***");
					    System.out.println("请输入姓名");
					    String name=sc.next();
					    for(j=0;j<names.length;j++) {
					    	if(name.equals(names[j])) {
					    		states[j]=2;//签收
					    		System.out.println("签收成功！欢迎下次光临");
					    		break;
					    	}
					    }
					    if(j==names.length) {
					    	System.out.println("没有查询到，如需要再次查询，请返回主界面！");
					    }
						break;
					case 4:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***删除订单***");//删除后 其他订单要往前移位
						String name1,dishmsg1,addresses1;int times1,states1;//用于换位
						System.out.println("序号\t订餐人\t\t\t\t\t\t\t\t\t\t餐品信息\t订餐时间\t送餐地址\t\t总金额\t订单状态");
						for( j=0;j<i;j++) {
							System.out.println((j+1)+"\t"
									+ names[j]+"\t"
									+ dishmsg[j]+"\t\t\t\t\t\t\t\t\t\t"
									+ times[j]+"\t"
									+ addresses[j]+"\t\t"
									+ ((states[j]==1)?"已预定":"已完成")+"\t");
						}//先输出一遍所有订单
						System.out.println("请输入要删除的订单序号订单序号");//因为名字可能一样 所以利用序号
						if(sc.hasNextInt()) {
							int ab=sc.nextInt();//序号
							
							if((ab>=1)&&(ab<i)) {//有i-1个订单 i最大为5
								if(states[ab-1]==1) {
									System.out.println("该订单为签收，请先签收再删除");
								}else{
									if(i==5) {
										//删除最后一位i--就行
									}else {
										for(j=ab;j<=i;j++) {
										//names dishmsg times adreese status要变动 
										dishmsg[j-1]=dishmsg[j];
										times[j-1]=times[j];
										addresses[j-1]=addresses[j];
										states[j-1]=states[j];
										names[j-1]=names[j];
										sumprice[j-1]=sumprice[j];
									}
									}
									
									i--;
									System.out.println("订单已删除");
								}
								
							}
						}else {
							System.out.println("输入错误，输入的不是序号，请重新操作");
						}
						   
						break;
					case 5:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***我要点赞***");
						System.out.println("请选择要点赞的菜品\n"
								+ "1-蒸羊羔 1999元/只 "+agree[0]+"赞\n"
								+ "2-蒸熊掌10000元/个 "+agree[1]+"赞\n"
								+ "3-蒸鹿尾50/份（原料猪肝）"+agree[2]+"赞\n"
								+ "4-烧花鸭20元 "+agree[3]+"赞\n"
							    + "5烧雏鸡19元 "+agree[4]+"赞");
						if(sc.hasNextInt()) {
							int ag=sc.nextInt();
							if((ag>=1)&&(ag<=5)) {
								agree[ag]++;
								System.out.println("成功点赞，谢谢支持！");
							}else {
								System.out.println("错误，请输入1-5");
							}
						}else {
							System.out.println("抱歉错误，请输入喜欢的菜品序号！");
						}
						break;
					case 6:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***退出系统***\n谢谢用餐，欢迎下此再来");
						return;
					default:
						System.out.println("无效选项，请输入1——6！");
			}
				System.out.println("是否继续操作，输入1为继续（返回主界面），0为退出系统");
			c=sc.nextInt();//是否退出
			switch(c) {
				case 1:
					break;
				case 0:
					System.out.println("退出成功！\n谢谢用餐，欢迎下此再来");
					bl=false;
					break;
				default:
					System.out.println("无效选项，默认继续。如推出请输入6");
					break;
			}
		}while(bl);

	}

}
