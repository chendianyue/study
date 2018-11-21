package com.proxy;

public class CarTimeProxy implements Moveable {
    private Moveable m;
    public Moveable getM() {
		return m;
	}


	public void setM(Moveable m) {
		this.m = m;
	}


	public CarTimeProxy(Moveable m){
    	this.m=m;
    }
	/*
 * 聚合的方式： 一个类调用另一个对象
 * 
 * */
	public void move(){        
		 long time1=System.currentTimeMillis();
		 System.out.println("汽车开始行驶------");
	       m.move();
	      long time2=System.currentTimeMillis();
		 System.out.println("汽车结束行驶-----行驶时间："+(time2-time1)+"毫秒");
		
	}
	
}
