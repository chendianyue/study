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
 * �ۺϵķ�ʽ�� һ���������һ������
 * 
 * */
	public void move(){        
		 long time1=System.currentTimeMillis();
		 System.out.println("������ʼ��ʻ------");
	       m.move();
	      long time2=System.currentTimeMillis();
		 System.out.println("����������ʻ-----��ʻʱ�䣺"+(time2-time1)+"����");
		
	}
	
}
