package com.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.proxy.Car;
import com.proxy.Moveable;

public class Test {
	/*
	 * JDK��̬������
	 * 
	 * */
public static void main(String[] args) {
	
     Car car=new Car();
     InvocationHandler h=new TimeHandler(car);
     Class<?> cls=car.getClass();
     System.out.println("cls:"+cls);
     //��̬����������
     /*
      * loader �������
      * interfaces  ʵ�ֽӿ�
      * h InvocationHandler ʵ�ִ�����
      * 
      * ��̬����ʵ��˼·
      * ʵ�ֹ��ܣ�ͨ��Proxy ��newProxyInstance f���ش������
      * 1.����һ��Դ�루��̬��������
      * 2.����Դ�루JDK Compiler API��,�����µ��ࣨ�����ࣩ
      * 3���������load���ڴ浱�У�����һ���µĶ��󣨴������
      * 4.return �������
      * */
     System.out.println("cls.getInterfaces()"+cls.getInterfaces());
     Moveable m=(Moveable)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(),h);
     String name=m.getClass().getName();
     System.out.println("name"+ name);
     m.move();
     
	
}
	
	
}
