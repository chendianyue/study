package com.adapter;
/*
 * 二相转三项
 * 
 * */

public class TwoPlugAdapter implements ThreePlugIf {
   private GBTwoPlug plug;
   
   public TwoPlugAdapter(GBTwoPlug plug){
	   this.plug=plug;
   }
	
	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
        System.out.println("通过转换二相转三项！！！");
		plug.powerWithTwo();
	}

}
