package com.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
   
	private Object target;
	
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
		
	}


	@Override
	public void invoke( Method m) {
		// TODO Auto-generated method stub
		
		try {
			long time1=System.currentTimeMillis();
			System.out.println("������ʼ��ʻ-----");
			m.invoke(target);
			long time2=System.currentTimeMillis();
			long time=time2-time1;
			System.out.println("����������ʻ---��������ʻʱ�䣺"+(time2-time1));
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
		
		
	}

}
