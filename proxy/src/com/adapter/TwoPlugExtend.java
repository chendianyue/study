package com.adapter;
/*
 * ���ü̳� �ķ�ʽ�Ĳ���������
 * 
 * */
public class TwoPlugExtend extends GBTwoPlug implements ThreePlugIf {

	@Override
	public void powerWithThree() {
		// TODO Auto-generated method stub
		System.out.println("�̳з�ʽ��������������");
		this.powerWithTwo();
		
	}

}
