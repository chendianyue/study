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
 * �ۺϵķ�ʽ�� һ���������һ������
 * 
 * */
	public void move(){        
		 long time1=System.currentTimeMillis();
		 System.out.println("��־��ʼ-----");
	       m.move();
	      long time2=System.currentTimeMillis();
		 System.out.println("��־����-----");
		
	}
	
}
