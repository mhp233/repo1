package classwork2_password;

public class Password {
	String password="1234567";
	public boolean change(String psw,String n){
		if(psw.equals(password)){
			System.out.println("������ȷ���������Ϊ"+n);
			return false;
		}else{
			System.out.println("�����������");
			return true;
		}
		
	}
	public String getpsw(){
		return password;
	}
}
