package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	private Object target;
	public  TimeHandler(Object target){
			this.target=target;
		}
/*
 * 参数：
 * proxy:被代理的对象
 * Method :被代理对象的方法
 * args ：被代理对象的方法的参数
 * */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long time1=System.currentTimeMillis();
		System.out.println("汽车开始行驶9999999");
		method.invoke(target);
	    long time2=System.currentTimeMillis();
	    System.out.println("汽车结束行使1111111汽车行驶时间："+(time2-time1)+"毫秒！");
		return null;
	}

}
