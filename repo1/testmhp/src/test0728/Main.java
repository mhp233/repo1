package test0728;

import java.util.Scanner;

public class Main {
	private int i=0;
	Student[] student = new Student[10];
	public void addstudent(String name ,int age){
		for(int i = 0;i<student.length;i++){
		  		if(student[i]==null){
		  		Student s = new Student();	
		  		s.setName(name);
				s.setAge(age);		
				student[i]=s;
				System.out.println("�ɹ�¼�룡");
				return;
			}
		}	
	}
	 
	public void showInfo(){
		for(Student s:student){
			if(s.getName()==null){
				continue;
			}
			System.out.println(s.getName()+","+s.getAge());
		}
	}
	
	public int find1(String name){
		int i=0;
		for (int j=0;j<student.length;j++){
			if(name.equals(student[i].getName())){
				i++;
			}
		}
		return i;
	}
	
	public int find2(int a,int b,String name){
		if((a<=b)&&(b<=student.length)){
			int i=0;
		
		for (int j=a;j<b;j++){
			if(name.equals(student[i].getName())){
				i++;
			}
		}
		return i;
		}else{
			System.out.println("�������");
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println("¼��ѧ����Ϣ������nֹͣ");
		while(true){
			System.out.println("����������������");
			String name=sc.next();
			int age=sc.nextInt();
			if(name.equals("n")){
				System.out.println("ֹͣ����");
				break;	
			}
			if((age<0)||(age>100)){
				System.out.println("���������д���");
				continue;
			}
			m.addstudent(name, age);	
		
			
		}
		System.out.println("������Ҫ���ҵ�ѧ������");
		String find = sc.next();
		
		System.out.println("��"+m.find1(find)+"��������ֵ�ѧ��");
		
	}

}
//�������� �м���
//������ʵλ�ú���ʼλ��