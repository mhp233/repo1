package test0618;

public class Student {
	String name;
	int age;
	double height;
	
	
	
	
	//������ �շ����� 
	public void study(){
		System.out.println(name+"ѧϰ");
	
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
		System.out.println(name+"����");
	}
	public void work(){
		System.out.println(name+"��"+subject+"��ҵ");
	}
	public String change(String name){
		this.name=name;
		return("���ָ�Ϊ"+this.name);
	}
	
}
