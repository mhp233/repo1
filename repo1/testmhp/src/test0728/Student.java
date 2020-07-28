package test0728;

public class Student {
private int a;
private String b;
private String sex;
private String name;
private int age;

	public String getName(){
		return name;
		}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	

	
	//Student[] Student = new Student[10];	
/**
	 * @param args
	 */
//	public Student(){
//		
//	}//无参构造方法
//	public Student(String b){ 
//		System.out.println(b);
//	
//	}//带参构造方法
//	//同一个类中 方法名相同 参数列表不同是方法重载 
//	public Student(int a){
//		
//	}
//	public void setSex(String sex){
//		if ((sex.equals("男"))||(sex.equals("女"))){
//			this.sex=sex;
//		}else{
//			System.out.println("输入有误 默认性别为null");
//			this.sex=null;
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
}
