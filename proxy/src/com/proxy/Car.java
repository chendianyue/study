package com.proxy;

import java.util.Random;

public class Car implements  Moveable {
    
	public void move(){
//		long starttime=System.currentTimeMillis();
//		System.out.println("������ʼ��ʻ---------");
		
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��-----car-----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
//		long endtime=System.currentTimeMillis();
//		System.out.println("����������ʻ---------������ʻʱ�䣺"+(endtime-starttime));
	}
	
}
