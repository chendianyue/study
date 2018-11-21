package singleInstance;

public class TestSingle {

	public static void main(String[] args) {
       
		Singleclass a=Singleclass.getInstance();
		
		System.out.println(Singleclass.singleclass.a);
		
		
	}
	
}
