package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;


import javax.activation.FileDataSource;

//import org.apache.commons.math3.ode.FieldSecondaryEquations;

/**
 * @author GUOQIUYUE
 *打印类信息包括类的成员函数、成员变量 
 *
 */
public class ClassUtil {
    public static void printClassMessage(Object object ){
      //获取类的类类型
      Class c=object.getClass();//传递的是哪个子类的对象，c就是该子类的类类型
      //获取类的名称
      System.out.println("类的名称是："+c.getName());
      
      //万事万物皆对象 方法也是对象 方法是Method 的对象
      /*
       * Method类  方法对象
       * 一个成员方法就是一个Method 对象
       * getMethods() 方法获取的是所有的public的函数，包括父类继承而来的
       *getDeclaredMethods()获取的是所有该类自己声明的方法，不论访问权限
       * 
       * */
      
      Method[] msMethods=c.getMethods();//c.getDeClaredMethods()
      for(int i=0;i<msMethods.length;i++){
    	  //得到方法的返回值类型的类类型
    	  Class returnType =msMethods[i].getReturnType();
    	  System.out.print(returnType.getName()+" ");
    	  //得到方法的名称
    	  System.out.print(msMethods[i].getName()+"(");
    	  
    	  //获取参数列表的类型的类类型
    	  Class[] paramTypes=msMethods[i].getParameterTypes();
    	  
    	  for(Class class1 :paramTypes){
    		  System.out.print(class1.getName()+",");
    		  
    	  }
    	  System.out.println(")");
   
      }
      
      
     
      
	  
	  System.out.println("成员变量 ");
	  
//	  printFieldMessage(c);
			 
			 
      
    	
    }

	public static void printFieldMessage(Object object) {
		
		Class c=object.getClass();
		/*
		   * 成员变量也是对象
		   * java.lang.reflect.Field
		   * Field类封装了关于成员变量的操作
		   * getFields()方法获取的是所有的public的成员变量的信息
		   * getDeclaredFileds获取的是该类自己声明的成员变量的信息
		   * */
		  
		  
//	 Field[] fs=c.getFields();
		 Field[] fs=c.getDeclaredFields();
		 
		 for(Field field:fs){
			 
			 //得到成员变量的类型的类类型
			 Class fieldType=field.getType();
			 String typeName=fieldType.getName();
			 
			 //得到成员变量的名称
			 String fieldName=field.getName();
			 System.out.println(typeName+" "+fieldName );
			 
		 }
		 
		}	

	   
	     /**
	     * @param 打印对象的构造函数的信息
	     */
	    public static void printConMessage(Object obj){
	    	
	    	Class c=obj.getClass();
	    	/*
	    	 * 构造函数也是对象
	    	 * java.lang.Constructor 中封装了构造函数的信息
	    	 * getConstructors 获取了所有的public 的构造函数
	    	 * 
	    	 * */
	    	
//	    	Constructor[] cs=c.getConstructors();
	    	Constructor[] cs=c.getDeclaredConstructors();
	    	
	    	for(Constructor constructor :cs){
             
	    		System.out.print(constructor.getName()+"(");
	    	    //获取构造函数的参数列表---》得到参数列表的类类型
	    		
	    		Class[] paramTypes=	constructor.getParameterTypes();
	    		for(Class class1:paramTypes){
	    			System.out.print(class1.getName()+" ");
	    			
	    		}
	    				
	    		
	    		System.out.println(")");		
	    	}
		   
	   }
	
	
	
}
