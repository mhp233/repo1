package classWork1_ticket;

public class Customer {
	String name;
	int age=999;
	public void ticket(){
		int price;
		if(age==999){
			System.out.println("请先录入完整信息");
			return;
		}
		if((age>0)&&(age<6)){
			price=0;
			System.out.println(name+"年龄："+age+" 门票免费");
		}else if((age>6)&&(age<60)){
			price=10;
			System.out.println(name+"年龄："+age+" 请给门票费："+price+"元");
		}else if(age>=60){
			price=5;
			System.out.println(name+"年龄："+age+" 请给门票费："+price+"元");
		}
	}
	
	
	public void setcus(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("录入信息为："+name+" 年龄："+age);
	}
	public String getInfo(){
		return (name+",年龄："+age);
	}
}
