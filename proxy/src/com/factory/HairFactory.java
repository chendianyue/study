package com.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HairFactory {

	public HairInterface getHair(String s){
		if("left".equals(s)){
			return new 	LeftHair();
			
		}else if("right".equals(s)){
			
			return new 	RightHair();
			
		
		}
			
			
			return null;
		
			
			
	}
	
	public HairInterface getHairByclass(String key){
		Properties pop=new Properties();
		try {
			InputStream in = new FileInputStream("src/type.properties");
			try {
				pop.load(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String classname=pop.getProperty(key);
		System.out.println("classnam:"+classname);
		HairInterface hair=null;
		try {
			hair=(HairInterface) Class.forName(classname).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return hair;
	}
	
	
}






