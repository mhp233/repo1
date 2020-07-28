package classwork2_password;

public class Password {
	String password="1234567";
	public boolean change(String psw,String n){
		if(psw.equals(password)){
			System.out.println("输入正确，密码更改为"+n);
			return false;
		}else{
			System.out.println("密码输入错误！");
			return true;
		}
		
	}
	public String getpsw(){
		return password;
	}
}
