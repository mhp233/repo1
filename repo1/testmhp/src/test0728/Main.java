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
				System.out.println("成功录入！");
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
			System.out.println("输入错误");
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Main m = new Main();
		System.out.println("录入学生信息，输入n停止");
		while(true){
			System.out.println("请输入姓名，年龄");
			String name=sc.next();
			int age=sc.nextInt();
			if(name.equals("n")){
				System.out.println("停止输入");
				break;	
			}
			if((age<0)||(age>100)){
				System.out.println("输入年龄有错误");
				continue;
			}
			m.addstudent(name, age);	
		
			
		}
		System.out.println("请输入要查找的学生姓名");
		String find = sc.next();
		
		System.out.println("有"+m.find1(find)+"个这个名字的学生");
		
	}

}
//查找姓名 有几个
//输入其实位置和起始位置