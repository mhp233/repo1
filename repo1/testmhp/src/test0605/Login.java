package test0605;
import java.util.Scanner;
public class Login {
//��¼ ���λ���

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i,a,x=0;
        String s,p;//������˺����룻
        String str[] =new String[] {"abc","cba","aaa","bbb"};//�˺�
        String psw[] =new String[] {"111","222","333","444"};//����
       do{
        	System.out.println("�������˺ź�����");
        	System.out.println("�������˺ţ�");
        	s=sc.next();//������˺Ŵ���s
        	for( a=0;a<=str.length-1;a++){//��Ӧ�˺�
        		if(s.equals(str[a])){
        			System.out.println("�˺��ǣ�"+s+"����������");
        			x=1;
        			break;
        		}
        		if(a==str.length-1){
        			System.out.println("�޴��˺� ��������,����������");
        		}
        	}
        }while(x!=1);//�˺�������ȷ���˳�ѭ��  �˺���s srt[a]
        System.out.println("�������˺ţ�"+str[a]+"�����빲�����λ���");
        for(i=0;i<3;i++){
        	System.out.println("���������룬������"+(3-i));
        	p=sc.next();
        	if(p.equals(psw[a])){
        		break;
        	}
        	
        }
        if(i==3){
        	System.out.println("�޻���");
        }else{
        	System.out.println("�ɹ�");
        }
        
        
	}

}
