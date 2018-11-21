package com.adapter;
/*
 * 采用继承 的方式的插座适配器
 * 
 * */
public class TwoPlugExtend extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("继承方式适配器！！！！");
		this.powerWithTwo();
		
	}

}
