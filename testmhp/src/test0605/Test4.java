package test0605;

import java.util.Scanner;

//升级购物结算 输入商品编号和购买数量 问是否继续    之后结算折扣 提示应付金额 并输入实付金额进行找钱
public class Test4 {
//之后加上件数 商品号数组
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;//商品编号
        int i;//商品数量
        int price=0,p=0;//应付金额
        int pay=0;//实付金额
        double change;//找零
        String w;//是否继续
        System.out.println("1网球10元\n2篮球99元\n3保龄球500元\n4高尔夫球200元");
        do{
        	System.out.println("请输入购买商品编号");
            no =sc.nextInt();
            System.out.println("请输入购买数量");
            i=sc.nextInt();
            switch(no){
            case 1:
            	p=10*i;
            	price=price+p;
            	System.out.println("网球10元 购买"+i+"件，合计"+p+"元");
            	break;
            case 2:
            	p=99*i;
            	price=price+p;
            	System.out.println("篮球99元，购买"+i+"件，合计"+p+"元");
            	break;
            case 3:
            	p=500*i;
            	price=price+p;
            	System.out.println("保龄球500元 购买"+i+"件，合计"+p+"元");
            	break;
            case 4:
            	p=200*i;
            	price=price+p;
            	System.out.println("高尔夫球200 购买"+i+"件，合计"+p+"元");
            	break;
            default: 
            	System.out.println("无此商品 购买无效");
            	break;
            }
            System.out.println("");
            System.out.println("是否要继续购买y/n");
            w=sc.next();
        }while(w.equals("y"));
        while(pay<0.8*price){
	        System.out.println("金额不足 请重新输入");
	        System.out.println("折扣0.8\n应付共"+0.8*price);
	        System.out.println("实付金额：");
	        pay=sc.nextInt();
        
        }	
        change= pay-0.8*price;
        System.out.println("找零："+change);
        
        
        
        
	}

}
