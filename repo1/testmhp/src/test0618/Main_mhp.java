package test0618;

public class Main_mhp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student();
//		s.wait()
		
		String i="t2";
		Teacher t3=new Teacher();
		Teacher t1=new Teacher();
		
				
		t1.name="�����";
		t1.age=21;
		t1.subject="*��Ŀ";
		t1.Teach();
		t1.work();
		
		System.out.println(t1.change("��"));
		Fruit f1=new Fruit();
		
		System.out.println(f1.juice(1,"ƻ��"));
	}

}
