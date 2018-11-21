package com.zhujie;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnno {

	public static void main(String[] args) {
	try {
		
			//使用类加载器加载类
			Class c=Class.forName("com.zhujie.Child");
			//找到类上上面的注解
			boolean isexit=c.isAnnotationPresent(Description.class);
			System.out.println("isexit:"+isexit);
			if(isexit){
			Description d=(Description) c.getAnnotation(Description.class);
			System.out.println("description :"+d.value());
			}
		
			//找到方法上的注解
			Method[] ms=c.getMethods();
			for(Method m :ms){
				boolean isMexit=m.isAnnotationPresent(Description.class);
				if(isMexit){
					Description d=(Description)m.getAnnotation(Description.class);
					System.out.println("Method description :"+d.value());
				}
				
			}
			
			
			for(Method m :ms){
			Annotation[] anno=m.getAnnotations();
			for(Annotation a:anno){
				if(a instanceof Description){
					Description d=(Description)a;
				    System.out.println("M description :"+d.value());
				}
			}
				
			}
			
			
			
			
			
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	}
	
	
}
