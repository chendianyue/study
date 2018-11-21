package com.proxy;

import java.util.Random;

public class Car implements  Moveable {
    
	public void move(){
//		long starttime=System.currentTimeMillis();
//		System.out.println("汽车开始行驶---------");
		
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中-----car-----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
//		long endtime=System.currentTimeMillis();
//		System.out.println("汽车结束行驶---------汽车行驶时间："+(endtime-starttime));
	}
	
}
