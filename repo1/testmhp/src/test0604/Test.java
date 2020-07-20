package test0604;
//书上的题 商场换购
import java.util.Scanner;

//商场换购 满50 加2换可乐1个 满100 加3换500ml可乐 加十元换5kg面粉
//200 加20换欧莱雅 10换苏泊尔炒锅
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
        System.out.println("请输入消费金额：");
        int count=s.nextInt();
        String str [] =new String []{
        "百事可乐饮料一瓶","500ml可乐一瓶","5kg面粉一袋","1个珀莱雅炒锅","欧莱雅爽肤水"
        };
        System.out.println("1:满50元，加两元换购" +str[0]
        		+"\n2:满100元，加3元换购" +str[1]
        		+"\n3:满100元，加10元换购" +str[2]
        		+"\n4:满200元，加10元换购"+str[3]
        		+"\n5:满200元，加20元换购"	+str[4]	
        	    +"\n0:不换购");
        System.out.println("请选择：");
      int count1;
        count1=s.nextInt();
        
        while (!((count1>=1)&&(count1<=5))){
        	System.out.println("请重新输入");
        }
        
         /* 	switch(count){
        	case 1: 
        		System.out.println("成功换购"+str);
        	}*/
        switch(count1){
        	case 1:
        		if(count>=50){
        			System.out.println("成功换购:"+str[count1-1]);
                	count=count+2;
                	System.out.println("消费金额:"+count);	
        		}else
        			System.out.println("不能换购");
        		break;
        	case 2:
        		if(count>=100){
        			System.out.println("成功换购:"+str[count1-1]);
        			count=count+3;
        			System.out.println("消费金额:"+count);	
        		
                }else
                	System.out.println("不能换购");
        	    break;
        	case 3:
        		if(count>=100){
        			System.out.println("成功换购:"+str[count1-1]);
        			count=count+10;
        			System.out.println("消费金额:"+count);	
        		
                }else
                	System.out.println("不能换购");
        	    break;
        	case 4:
        		if(count>=200){
        			System.out.println("成功换购:"+str[count1-1]);
        			count=count+10;
        			System.out.println("消费金额:"+count);	
        		
                }else
                	System.out.println("不能换购");
        	    break;
        	case 5:
        		if(count>=200){
        			System.out.println("成功换购:"+str[count1-1]);
        			count=count+20;
        			System.out.println("消费金额:"+count);	
        		
                }else
                	System.out.println("不能换购");
        	    break;
		
        } 
        
        
        
	}
}
