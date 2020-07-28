package test0618;

public class Student {
	String name;
	int age;
	double height;
	
	
	
	
	//方法名 驼峰命名 
	public void study(){
		System.out.println(name+"学习");
	
	}
	public void homeWork(){
		
	}
	
	public void showInfo(){
		
	}
	
}


class Teacher{
	String name;
	int age;
	String subject;
	public void Teach(){
		System.out.println(name+"讲课");
	}
	public void work(){
		System.out.println(name+"批"+subject+"作业");
	}
	public String change(String name){
		this.name=name;
		return("名字改为"+this.name);
	}
	
}
