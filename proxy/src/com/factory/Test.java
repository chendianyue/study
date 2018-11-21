package com.factory;

public class Test {
    
    
     public static void main(String[] args) {
//    	 HairInterface lefthair=new LeftHair();
//    	 lefthair.draw();
		 HairFactory hair=new HairFactory();
//		 hair.getHair("left").draw();
    	 hair.getHairByclass("left").draw();
    	 
	}
	
}
