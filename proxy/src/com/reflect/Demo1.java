package com.reflect;
public class Demo1 {
	  public static void main(String[] args) {
		//Fooʵ������
		  Foo foo1=new Foo();
		//Foo ����౾��Ҳ��һ��ʵ������Class���ʵ��������α�ʾ 
		//�κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�﷽ʽ
		
	   //��һ�� ��﷽ʽ--���κ�һ���඼��һ�������ľ�̬��Ա����class
	     Class c1=Foo.class;
	    
	   //�ڶ��ֱ�﷽ʽ �Ѿ�֪������Ķ���ͨ��getClass����
	     Class c2=foo1.getClass();
	   
	   //c1 c2 ��ʾ��F	oo ���������
	   //��������Զ�����Ҳ�Ƕ�����Class �� ��ʵ������
	   //��������ų�Ϊ�����������
	   
	   //����c1 or c2 ��������Foo��������ͣ�һ����ֻ������Class���һ��ʵ������
	   System.out.println(c1==c2);
  
	   //�����ֱ�﷽ʽ
	   Class c3=null;
	   try {
		c3= Class.forName("com.reflect.Foo");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	    System.out.println(c2==c3);
	   
	 //����ͨ������������ʹ��������ʵ������   ͨ��c1 or c2 or c3 ����Foo ��ʵ������
	   try {
		Foo foo =(Foo)c1.newInstance();
		foo.print();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	    
	   
	   
	   
	}

}
    class Foo {
    	void print(){
    		System.out.println("FOO");
    	}
    	
    }