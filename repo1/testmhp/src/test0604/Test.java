package test0604;
//���ϵ��� �̳�����
import java.util.Scanner;

//�̳����� ��50 ��2������1�� ��100 ��3��500ml���� ��ʮԪ��5kg���
//200 ��20��ŷ���� 10���ղ�������
public class Test {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
        System.out.println("���������ѽ�");
        int count=s.nextInt();
        String str [] =new String []{
        "���¿�������һƿ","500ml����һƿ","5kg���һ��","1�������ų���","ŷ����ˬ��ˮ"
        };
        System.out.println("1:��50Ԫ������Ԫ����" +str[0]
        		+"\n2:��100Ԫ����3Ԫ����" +str[1]
        		+"\n3:��100Ԫ����10Ԫ����" +str[2]
        		+"\n4:��200Ԫ����10Ԫ����"+str[3]
        		+"\n5:��200Ԫ����20Ԫ����"	+str[4]	
        	    +"\n0:������");
        System.out.println("��ѡ��");
      int count1;
        count1=s.nextInt();
        
        while (!((count1>=1)&&(count1<=5))){
        	System.out.println("����������");
        }
        
         /* 	switch(count){
        	case 1: 
        		System.out.println("�ɹ�����"+str);
        	}*/
        switch(count1){
        	case 1:
        		if(count>=50){
        			System.out.println("�ɹ�����:"+str[count1-1]);
                	count=count+2;
                	System.out.println("���ѽ��:"+count);	
        		}else
        			System.out.println("���ܻ���");
        		break;
        	case 2:
        		if(count>=100){
        			System.out.println("�ɹ�����:"+str[count1-1]);
        			count=count+3;
        			System.out.println("���ѽ��:"+count);	
        		
                }else
                	System.out.println("���ܻ���");
        	    break;
        	case 3:
        		if(count>=100){
        			System.out.println("�ɹ�����:"+str[count1-1]);
        			count=count+10;
        			System.out.println("���ѽ��:"+count);	
        		
                }else
                	System.out.println("���ܻ���");
        	    break;
        	case 4:
        		if(count>=200){
        			System.out.println("�ɹ�����:"+str[count1-1]);
        			count=count+10;
        			System.out.println("���ѽ��:"+count);	
        		
                }else
                	System.out.println("���ܻ���");
        	    break;
        	case 5:
        		if(count>=200){
        			System.out.println("�ɹ�����:"+str[count1-1]);
        			count=count+20;
        			System.out.println("���ѽ��:"+count);	
        		
                }else
                	System.out.println("���ܻ���");
        	    break;
		
        } 
        
        
        
	}
}
