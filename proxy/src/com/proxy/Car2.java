package com.proxy;

public class Car2 extends Car{

	public void move(){
		long time1=System.currentTimeMillis();
		System.out.println("汽车开始行驶--------");
		super.move();
		long time2=System.currentTimeMillis();
	    System.out.println("汽车结束行驶------汽车行驶时间："+(time2-time1)+"毫秒");
	}
	
	public static void main(String[] args) {
		Car2  car2=new Car2();
		car2.move();
	} 
	
}
