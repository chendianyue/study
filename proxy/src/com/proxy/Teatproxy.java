package com.proxy;

import java.lang.reflect.InvocationTargetException;

public class Teatproxy {
	
    public static void main(String[] args) {
		try {
		   Car car=new Car();
		   InvocationHandler h=new TimeHandler(car);
			Moveable m=(Moveable)Proxy.newProxyInstance(Moveable.class,h);
			m.move();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

