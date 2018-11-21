package com.proxy;

public class CarLogProxy2 implements Moveable {
    private Moveable m;
	
	
	

    public Moveable getM() {
		return m;
	}


	public void setM(Moveable m) {
		this.m = m;
	}


	public CarLogProxy2(Moveable m){
    	this.m=m;
    }


	/*
 * 聚合的方式： 一个类调用另一个对象
 * 
 * */
	public void move(){        
		 long time1=System.currentTimeMillis();
		 System.out.println("日志开始-----");
	       m.move();
	      long time2=System.currentTimeMillis();
		 System.out.println("日志结束-----");
		
	}
	
}
