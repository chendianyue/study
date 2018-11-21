package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.proxy.Car;
import com.proxy.Moveable;

public class Test {
	/*
	 * JDK动态代理类
	 * 
	 * */
public static void main(String[] args) {
	
     Car car=new Car();
     InvocationHandler h=new TimeHandler(car);
     Class<?> cls=car.getClass();
     System.out.println("cls:"+cls);
     //动态创立代理类
     /*
      * loader 类加载器
      * interfaces  实现接口
      * h InvocationHandler 实现处理器
      * 
      * 动态代理实现思路
      * 实现功能：通过Proxy 的newProxyInstance f返回代理对象
      * 1.声明一段源码（动态产生代理）
      * 2.编译源码（JDK Compiler API）,产生新的类（代理类）
      * 3、将这个类load到内存当中，产生一个新的对象（代理对象）
      * 4.return 代理对象
      * */
     System.out.println("cls.getInterfaces()"+cls.getInterfaces());
     Moveable m=(Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),h);
     String name=m.getClass().getName();
     System.out.println("name"+ name);
     m.move();
     
	
}
	
	
}
