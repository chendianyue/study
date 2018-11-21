package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	private Object target;
	public  TimeHandler(Object target){
			this.target=target;
		}
/*
 * ������
 * proxy:������Ķ���
 * Method :���������ķ���
 * args �����������ķ����Ĳ���
 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long time1=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ9999999");
		method.invoke(target);
	    long time2=System.currentTimeMillis();
	    System.out.println("����������ʹ1111111������ʻʱ�䣺"+(time2-time1)+"���룡");
		return null;
	}

}
