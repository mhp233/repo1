package test0605;

import java.util.Scanner;

//����������� ������Ʒ��ź͹������� ���Ƿ����    ֮������ۿ� ��ʾӦ����� ������ʵ����������Ǯ
public class Test4 {
//֮����ϼ��� ��Ʒ������
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;//��Ʒ���
        int i;//��Ʒ����
        int price=0,p=0;//Ӧ�����
        int pay=0;//ʵ�����
        double change;//����
        String w;//�Ƿ����
        System.out.println("1����10Ԫ\n2����99Ԫ\n3������500Ԫ\n4�߶�����200Ԫ");
        do{
        	System.out.println("�����빺����Ʒ���");
            no =sc.nextInt();
            System.out.println("�����빺������");
            i=sc.nextInt();
            switch(no){
            case 1:
            	p=10*i;
            	price=price+p;
            	System.out.println("����10Ԫ ����"+i+"�����ϼ�"+p+"Ԫ");
            	break;
            case 2:
            	p=99*i;
            	price=price+p;
            	System.out.println("����99Ԫ������"+i+"�����ϼ�"+p+"Ԫ");
            	break;
            case 3:
            	p=500*i;
            	price=price+p;
            	System.out.println("������500Ԫ ����"+i+"�����ϼ�"+p+"Ԫ");
            	break;
            case 4:
            	p=200*i;
            	price=price+p;
            	System.out.println("�߶�����200 ����"+i+"�����ϼ�"+p+"Ԫ");
            	break;
            default: 
            	System.out.println("�޴���Ʒ ������Ч");
            	break;
            }
            System.out.println("");
            System.out.println("�Ƿ�Ҫ��������y/n");
            w=sc.next();
        }while(w.equals("y"));
        while(pay<0.8*price){
	        System.out.println("���� ����������");
	        System.out.println("�ۿ�0.8\nӦ����"+0.8*price);
	        System.out.println("ʵ����");
	        pay=sc.nextInt();
        
        }	
        change= pay-0.8*price;
        System.out.println("���㣺"+change);
        
        
        
        
	}

}
