package test0612;

import java.util.Scanner;

//dvd ����͹黹 ��������    �黹 ��������  ��� 

public class Test_dvd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choose=0;
		int c,i=0;
		boolean bl=false;
//��ʼ��dvd��Ϣ  ���������dvd��Ϣ
		String dvdname[]=new String[6];
		int status[] = new int [6];//0Ϊ�ɽ� 1Ϊ�ѽ��
		int date[]=new int [6];//�������
		int count[]=new int [6];//�������
		dvdname[0]="a";
		dvdname[1]="b";
		
		 do {
			i=0;
			System.out.println("DVD�軹ϵͳ����ѡ���ܣ�\n"
					+ "**********************************\n"
					+ "1.����dvd\n"
					+ "2.�鿴dvd\n"
					+ "3.ɾ��dvd\n"
					+ "4.���dvd\n"
					+ "5.�黹dvd\n"
					+ "6.�Ƴ�dvd\n"
					+ "**********************************\n"
					+ "������ѡ��:\n");
			choose=sc.nextInt();//����ѡ�����switch
			switch(choose){
				case 1:
					System.out.println("-->����DVD\n\n"
							+ "������Ҫ������DVD����:");
					String add;
					add=sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(dvdname[i]==null) {
							dvdname[i]=add;
							System.out.println("��� ���ƣ�"+i+dvdname[i]);
							System.out.println("�����ɹ�");
							break;
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("����ʧ�ܣ�û�п�λ");
					}
					break;
				case 2:
					System.out.println("-->�鿴DVD\n\n");
					System.out.println("���\t״̬\t����\t�������\t�������");
					for(i=0;i<dvdname.length;i++) {
						if(dvdname[i]!=null) {
							String dvdstatus= status[i]==0?"�ɽ���":"�ѽ��";
							String data= date[i]==0?"":date[i]+"��";
							System.out.println((i+1)+"\t"+dvdstatus+"\t"+dvdname[i]+"\t"+data+"\t"+count[i]);
						}		
					}
					break;
				case 3:
					System.out.println("-->ɾ��DVD\n\n");
					System.out.println("������DVD���֣�");
					String delname =sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(delname.equals(dvdname[i])) {
							if(status[i]==0) {
								dvdname[i]=null;
								System.out.println("ɾ���ɹ�");	
							}else {
								System.out.println("��DVD�Ѿ����������黹��ɾ����");
							}
							
							break;
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("ɾ��Ŀ��û�м�¼ ʧ��");
					}
					break;
				case 4:
					System.out.println("-->����dvd");
					System.out.println("���������DVD���֣�����");
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
								System.out.println("��dvd�Ѿ����");
							}
							
							break;
						}
					}
					if(i==dvdname.length) {
						System.out.println("�޴�dvd ����ʧ��");
					}
					break;
				case 5:
					System.out.println("-->�黹dvd");
					System.out.println("������黹DVD����");
					String name;
					name=sc.next();
					for(i=0;i<dvdname.length;i++) {
						if(name.equals(dvdname[i])) {
							if(status[i]==0) {
								status[i]=0;
								System.out.println("������黹������");
								int date2=sc.nextInt();
								System.out.println("����������"+date[i]+"\n�黹������"+date2+"\nӦ����"+5*(date2-date[i]));		
								date[i]=0;	
								break;
							}else {
								System.out.println(dvdname[i]+"����dvdû�б���");
								break;
							}
							
							
						}
						
					}
					if(i==dvdname.length) {
						System.out.println("�黹ʧ��");
					}
					break;
				case 6:
					bl=false;
					System.out.println("ϵͳ���˳�");
					return;
				default:
					System.out.println("ѡ����� ������ѡ�������� ��1-6��");
			}
			    
			
				System.out.println("�Ƿ����������1���� ��0�˳�");//ѯ���Ƿ����
			    c=sc.nextInt();
			    if(c==1) {
			    	bl=true; 
			    }
		}while(bl); 
		System.out.println("\n������ϵͳ���˳���");
	}

}
