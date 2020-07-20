package test0605;
import java.util.Scanner;
public class Login {
//登录 三次机会

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i,a,x=0;
        String s,p;//输入的账号密码；
        String str[] =new String[] {"abc","cba","aaa","bbb"};//账号
        String psw[] =new String[] {"111","222","333","444"};//密码
       do{
        	System.out.println("请输入账号和密码");
        	System.out.println("请输入账号：");
        	s=sc.next();//输入的账号存入s
        	for( a=0;a<=str.length-1;a++){//对应账号
        		if(s.equals(str[a])){
        			System.out.println("账号是："+s+"请输入密码");
        			x=1;
        			break;
        		}
        		if(a==str.length-1){
        			System.out.println("无此账号 重新输入,请重新输入");
        		}
        	}
        }while(x!=1);//账号输入正确后退出循环  账号是s srt[a]
        System.out.println("亲输入账号："+str[a]+"的密码共有三次机会");
        for(i=0;i<3;i++){
        	System.out.println("请输入密码，次数："+(3-i));
        	p=sc.next();
        	if(p.equals(psw[a])){
        		break;
        	}
        	
        }
        if(i==3){
        	System.out.println("无机会");
        }else{
        	System.out.println("成功");
        }
        
        
	}

}
