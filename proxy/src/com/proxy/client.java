package com.proxy;

public class client {
	public static void main(String[] args) {
		Car car=new Car();
//		car.move();
		CarTimeProxy ctp=new CarTimeProxy(car);
		CarLogProxy2 clp=new CarLogProxy2(ctp);
		clp.move();
	}

}
