package com.proxy;

public class Car2 extends Car{

	public void move(){
		long time1=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ--------");
		super.move();
		long time2=System.currentTimeMillis();
	    System.out.println("����������ʻ------������ʻʱ�䣺"+(time2-time1)+"����");
	}
	
	public static void main(String[] args) {
		Car2  car2=new Car2();
		car2.move();
	} 
	
}
