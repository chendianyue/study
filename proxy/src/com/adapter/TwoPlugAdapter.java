package com.adapter;
/*
 * ����ת����
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
        System.out.println("ͨ��ת������ת�������");
		plug.powerWithTwo();
	}

}
