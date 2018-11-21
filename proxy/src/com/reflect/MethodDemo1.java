package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {
    public static void main(String[] args) {
		//Ҫ��ȡprint(int,int) ����
    	/*
    	 * ���Ȼ�ȡ���������
    	 * */
    	A a1=new A();
    	Class<? extends A> c=a1.getClass();
        /*
         * ��ȡ���� ���ƺͲ����б�
         * getMethod ��ȡ����public �ķ���
         * c.getDeclaredMethod �Լ������ķ���
         * 
         */
    	try {
			Method m=c.getMethod("print", new Class[] {int.class,int.class});
			//a1.print(10,20)�����ķ������  ����m���������з����ĵ��ú�a1��Ч����һ����
			//�������û�з���ֵ����null,�з���ֵ���ؾ���ķ���ֵ
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