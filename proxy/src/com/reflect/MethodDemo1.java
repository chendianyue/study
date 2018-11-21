package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
		//要获取print(int,int) 方法
    	/*
    	 * 首先获取类的类类型
    	 * */
    	A a1=new A();
    	Class<? extends A> c=a1.getClass();
        /*
         * 获取方法 名称和参数列表
         * getMethod 获取的是public 的方法
         * c.getDeclaredMethod 自己声明的方法
         * 
         */
    	try {
			Method m=c.getMethod("print", new Class[] {int.class,int.class});
			//a1.print(10,20)方法的反射操作  是用m对象来进行方法的调用和a1的效果是一样的
			//方法如果没有返回值返回null,有返回值返回具体的返回值
			try {
				System.out.println("---");
				int o=(Integer)m.invoke(a1, new Object[]{10,20});
				System.out.println("------------");
				System.out.println("o:"+o);
				Method m1=c.getMethod("print", String.class,String.class);
//				Method m1=c.getMethod("String", new Class[]{String.class,String.class});
				m1.invoke(a1, "weertt","UUUO");
				
				
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
	}
}
class A{
	  public int print(int a,int b){
		  
		  System.out.println(a+b);
		  return a+b;
	  }
	  
	  
	  public void print(String a,String b){
		  System.out.println(a.toUpperCase()+","+b.toLowerCase());
	  }
	
	
}