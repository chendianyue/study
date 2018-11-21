package com.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodDemo4 {

	   public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		
		ArrayList<String> a2=new ArrayList<>();
		a2.add("hello");
		
		
		Class c1=a1.getClass();
		
		Class c2=a2.getClass();
		System.out.println(c1==c2);
		/*c1==c2 �������true˵�� ����֮�󼯺ϵķ�����ȥ���ͻ���
		 * java�м��ϵķ����Ƿ�ֹ��������ģ�ֻ�ڱ���׶���Ч���ƹ��������Ч��
		 * ��֤ ����ͨ�������ķ��������� ���ƹ����� 
		 * */
		try {
			Method m=c2.getMethod("add", Object.class);
			try {
				m.invoke(a2,100);
				
				System.out.println(a2.size());
				System.out.println(a2);
				for(int i=0;i<a2.size();i++){
					System.out.println((Object)a2.get(i));
				}
			
				
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
