package classWork1_ticket;

public class Customer {
	String name;
	int age=999;
	public void ticket(){
		int price;
		if(age==999){
			System.out.println("����¼��������Ϣ");
			return;
		}
		if((age>0)&&(age<6)){
			price=0;
			System.out.println(name+"���䣺"+age+" ��Ʊ���");
		}else if((age>6)&&(age<60)){
			price=10;
			System.out.println(name+"���䣺"+age+" �����Ʊ�ѣ�"+price+"Ԫ");
		}else if(age>=60){
			price=5;
			System.out.println(name+"���䣺"+age+" �����Ʊ�ѣ�"+price+"Ԫ");
		}
	}
	
	
	public void setcus(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("¼����ϢΪ��"+name+" ���䣺"+age);
	}
	public String getInfo(){
		return (name+",���䣺"+age);
	}
}
