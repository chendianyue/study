package com.proxy;

public class Car3Log extends Car2{

	public void move(){
		long time1=System.currentTimeMillis();
		System.out.println("��־��ʼ-----");
		super.move();
		long time2=System.currentTimeMillis();
	    System.out.println("��־����-----");
	}
	
	public static void main(String[] args) {
		Car3Log  car2=new Car3Log();
		car2.move();
	}
	
}
