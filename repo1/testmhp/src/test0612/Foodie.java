package test0612;

import java.util.Scanner;

//�Ի�����
public class Foodie {

	public static void main(String[] args) {
		int choose=0;//������4����Ϣ
		int k=1;//���ڸ��˶����Ĳ�Ʒ���
		String names[]=new String[4];//������������Ϣ
		String dishmsg[] =new String[4];//��ѡ��Ϣ ��Ʒ�� ������Ʒ��Ϣ
		int dish[][]=new int[4][5];//���ÿ��������ÿ����Ʒ���� ����һ�Ŷ����ʹ��� dish[0][],���0-4��Ӧ��Ʒ1-5����
		int times[]=new int[4];//�Ͳ�ʱ��
		String addresses[]=new String[4];//�Ͳ͵�ַ
		int states []= new int [4];//����״̬ 1��ʾ��Ԥ�� 2��ʾ�����
		double sumprice[]=new double [4];//�����ܼ�
		double charge=0;//�Ͳͷ�
		boolean bl=true;//�������Ƿ�ѭ��ϵͳѡ��
		boolean bl2=true;//����
		Scanner sc = new Scanner(System.in);
		int c=1;//�� 0 1//�ж�����Ƿ��˳�ϵͳ
		int i=0;//��ʾ�Ĵ��������е���λ
		int j;//����ǩ�ղ���
		String dishname[]= {	"����� 1999Ԫ/ֻ"
				, "������10000Ԫ/��"
				, "��¹β50/�ݣ�ԭ����Σ�"
				, "�ջ�Ѽ20Ԫ/��"
				, "�ճ���19Ԫ/��"};//�˵�
		int agree[]=new int[5];//��¼�˵��ĵ�����
		int dishprice[]= {1999,10000,50,20,19};//��Ʒ�۸� ��dishname��Ӧ
		do {
				System.out.println("��ӭʹ�á��Ի����ˡ�����ϵͳ\n"
				+ "***************************\n"
				+"1����Ҫ����\n"
				+"2���鿴�ʹ�\n"
				+"3��ǩ�ն���\n"
				+"4��ɾ������\n"
				+"5����Ҫ����\n"
				+"6���˳�ϵͳ\n***************************\n��ѡ��");
				choose=sc.nextInt();
		
				switch(choose) {
					case 1:///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						if(i==5) {
							System.out.println("��������������ɾ������");
							break;
						}
						dishmsg[i]="";
						System.out.println("***��Ҫ����***");
						System.out.println("������������");
						names[i]=sc.next();
						System.out.println("�������ַ��");
						addresses[i]=sc.next();
						System.out.println("��ѡ��Ҫ��Ĳ�Ʒ\n"
								+ "1-����� 1999Ԫ/ֻ "+agree[0]+"��\n"
								+ "2-������10000Ԫ/�� "+agree[1]+"��\n"
								+ "3-��¹β50/�ݣ�ԭ����Σ�"+agree[2]+"��\n"
								+ "4-�ջ�Ѽ20Ԫ "+agree[3]+"��\n"
							    + "5�ճ���19Ԫ "+agree[4]+"��");
						
						do {
							
							int choose2=sc.nextInt();//��Ĳ�Ʒ�ı��Ϊchoose2
							choose2--;
							do {
								if((choose2>=1)&&(choose2<=5)) {
								break;
							}else {
								System.out.println("������������ȷ�Ĳ�Ʒ���");
								
							}
							}while(true);//���
							System.out.println("��ѡ��Ʒ");
							System.out.println(dishname[choose2]);
							System.out.println("������ò�Ʒ����");
							int x=sc.nextInt();      //��Ʒ����Ϊx
							dish[i][choose2]+=x;//��¼�ڸ��˲�Ʒ�����Ķ�ά������ choose2�Ĳ�Ʒ����x��
							System.out.println("�ɹ�����");
							sumprice[i]=sumprice[i]+x*dishprice[choose2];
							dishmsg[i]=dishmsg[i]+x+"-"+dishname[choose2]+" ";
							System.out.println("�Ƿ������ͣ�1Ϊ���� 2Ϊ����");
							if(sc.hasNext()) {
								int ab=sc.nextInt();
								switch(ab) {
								case 1:
									System.out.println("�������");
									break;
								case 2:
									System.out.println("�������");
									bl2=false;
									break;
								default:
									System.out.println("�����������������1��2�����ε�ͽ�����");
									bl2=false;
								}
							}else {
								System.out.println("�����������������1��2�����ε�ͽ�����");
								bl2=false;
							}
							
							
						}while(bl2);
						bl2=true;//����
						do {                                                         
							System.out.println("�����붩��ʱ�䣺��**�㣩10-20��");
							if(sc.hasNext()) {
							    int time=sc.nextInt();
							    if((time<=20)&&(time>=10)) {
							    	times[i]=time;
							    	System.out.println("ʱ����ȷ��");
							    	break;
							    }
							}else {
								System.out.println("����������������������ʾʱ�� 10-20�� ");
							}
						}while(true);//���붩��ʱ�䲿��
						states[i]=1;//1��ʾ������Ԥ�� 2λ���
						if(sumprice[i]<=50) {
							System.out.println("����50Ԫ,����5Ԫ�Ͳͷ�" );
							charge=5;
						}
						System.out.println("���ͳɹ�\n"
								+ "�����Ĳ�Ʒ��\n"
								+ dishmsg[i]+"\n"
								+ "�Ͳ�ʱ���ǣ�"+times[i]
								+ "\n�ͷѣ�"+sumprice[i]+" �Ͳͷѣ�"+charge+"�ܼƣ�"+(sumprice[i]+charge)
								+ "");
						sumprice[i]=sumprice[i]+charge;
						charge=0;
						i++;//��ʾ������һ������ ��һ��������������[i]λ��
						break;
					case 2:///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***�鿴�ʹ�***");
						System.out.println("���\t������"+"              "+"��Ʒ��Ϣ\t����ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
						for( j=0;j<i;j++) {
							System.out.println((j+1)+"\t"
									+ names[j]+"              "
									+ dishmsg[j]+"\t"
									+ times[j]+"\t"
									+ addresses[j]+"\t\t"
									+sumprice[j]+"\t"
									+ ((states[j]==1)?"��Ԥ��":"�����")+"\t");//�Ժ��
						}
						break;
					case 3:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***ǩ�ն���***");
					    System.out.println("����������");
					    String name=sc.next();
					    for(j=0;j<names.length;j++) {
					    	if(name.equals(names[j])) {
					    		states[j]=2;//ǩ��
					    		System.out.println("ǩ�ճɹ�����ӭ�´ι���");
					    		break;
					    	}
					    }
					    if(j==names.length) {
					    	System.out.println("û�в�ѯ��������Ҫ�ٴβ�ѯ���뷵�������棡");
					    }
						break;
					case 4:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***ɾ������***");//ɾ���� ��������Ҫ��ǰ��λ
						String name1,dishmsg1,addresses1;int times1,states1;//���ڻ�λ
						System.out.println("���\t������\t\t\t\t\t\t\t\t\t\t��Ʒ��Ϣ\t����ʱ��\t�Ͳ͵�ַ\t\t�ܽ��\t����״̬");
						for( j=0;j<i;j++) {
							System.out.println((j+1)+"\t"
									+ names[j]+"\t"
									+ dishmsg[j]+"\t\t\t\t\t\t\t\t\t\t"
									+ times[j]+"\t"
									+ addresses[j]+"\t\t"
									+ ((states[j]==1)?"��Ԥ��":"�����")+"\t");
						}//�����һ�����ж���
						System.out.println("������Ҫɾ���Ķ�����Ŷ������");//��Ϊ���ֿ���һ�� �����������
						if(sc.hasNextInt()) {
							int ab=sc.nextInt();//���
							
							if((ab>=1)&&(ab<i)) {//��i-1������ i���Ϊ5
								if(states[ab-1]==1) {
									System.out.println("�ö���Ϊǩ�գ�����ǩ����ɾ��");
								}else{
									if(i==5) {
										//ɾ�����һλi--����
									}else {
										for(j=ab;j<=i;j++) {
										//names dishmsg times adreese statusҪ�䶯 
										dishmsg[j-1]=dishmsg[j];
										times[j-1]=times[j];
										addresses[j-1]=addresses[j];
										states[j-1]=states[j];
										names[j-1]=names[j];
										sumprice[j-1]=sumprice[j];
									}
									}
									
									i--;
									System.out.println("������ɾ��");
								}
								
							}
						}else {
							System.out.println("�����������Ĳ�����ţ������²���");
						}
						   
						break;
					case 5:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***��Ҫ����***");
						System.out.println("��ѡ��Ҫ���޵Ĳ�Ʒ\n"
								+ "1-����� 1999Ԫ/ֻ "+agree[0]+"��\n"
								+ "2-������10000Ԫ/�� "+agree[1]+"��\n"
								+ "3-��¹β50/�ݣ�ԭ����Σ�"+agree[2]+"��\n"
								+ "4-�ջ�Ѽ20Ԫ "+agree[3]+"��\n"
							    + "5�ճ���19Ԫ "+agree[4]+"��");
						if(sc.hasNextInt()) {
							int ag=sc.nextInt();
							if((ag>=1)&&(ag<=5)) {
								agree[ag]++;
								System.out.println("�ɹ����ޣ�лл֧�֣�");
							}else {
								System.out.println("����������1-5");
							}
						}else {
							System.out.println("��Ǹ����������ϲ���Ĳ�Ʒ��ţ�");
						}
						break;
					case 6:	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						System.out.println("***�˳�ϵͳ***\nлл�òͣ���ӭ�´�����");
						return;
					default:
						System.out.println("��Чѡ�������1����6��");
			}
				System.out.println("�Ƿ��������������1Ϊ���������������棩��0Ϊ�˳�ϵͳ");
			c=sc.nextInt();//�Ƿ��˳�
			switch(c) {
				case 1:
					break;
				case 0:
					System.out.println("�˳��ɹ���\nлл�òͣ���ӭ�´�����");
					bl=false;
					break;
				default:
					System.out.println("��Чѡ�Ĭ�ϼ��������Ƴ�������6");
					break;
			}
		}while(bl);

	}

}
