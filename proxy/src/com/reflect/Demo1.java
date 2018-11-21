package com.reflect;
public class Demo1 {
	  public static void main(String[] args) {
		//Foo实例对象
		  Foo foo1=new Foo();
		//Foo 这个类本身也是一个实例对象，Class类的实例对象，如何表示 
		//任何一个类都是Class的实例对象，这个实例对象有三种表达方式
		
	   //第一种 表达方式--》任何一个类都有一个隐含的静态成员变量class
	     Class c1=Foo.class;
	    
	   //第二种表达方式 已经知道该类的对象通过getClass方法
	     Class c2=foo1.getClass();
	   
	   //c1 c2 表示了F	oo 类的类类型
	   //万事万物皆对象，类也是对象，是Class 类 的实例对象
	   //这个类我门称为该类的类类型
	   
	   //不管c1 or c2 都代表了Foo类的类类型，一个类只可能是Class类的一个实例对象
	   System.out.println(c1==c2);
  
	   //第三种表达方式
	   Class c3=null;
	   try {
		c3= Class.forName("com.reflect.Foo");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	    System.out.println(c2==c3);
	   
	 //可以通过该类的类类型创建该类的实例对象   通过c1 or c2 or c3 创建Foo 的实例对象
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