package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;


import javax.activation.FileDataSource;

//import org.apache.commons.math3.ode.FieldSecondaryEquations;

/**
 * @author GUOQIUYUE
 *��ӡ����Ϣ������ĳ�Ա��������Ա���� 
 *
 */
public class ClassUtil {
    public static void printClassMessage(Object object ){
      //��ȡ���������
      Class c=object.getClass();//���ݵ����ĸ�����Ķ���c���Ǹ������������
      //��ȡ�������
      System.out.println("��������ǣ�"+c.getName());
      
      //��������Զ��� ����Ҳ�Ƕ��� ������Method �Ķ���
      /*
       * Method��  ��������
       * һ����Ա��������һ��Method ����
       * getMethods() ������ȡ�������е�public�ĺ�������������̳ж�����
       *getDeclaredMethods()��ȡ�������и����Լ������ķ��������۷���Ȩ��
       * 
       * */
      
      Method[] msMethods=c.getMethods();//c.getDeClaredMethods()
      for(int i=0;i<msMethods.length;i++){
    	  //�õ������ķ���ֵ���͵�������
    	  Class returnType =msMethods[i].getReturnType();
    	  System.out.print(returnType.getName()+" ");
    	  //�õ�����������
    	  System.out.print(msMethods[i].getName()+"(");
    	  
    	  //��ȡ�����б�����͵�������
    	  Class[] paramTypes=msMethods[i].getParameterTypes();
    	  
    	  for(Class class1 :paramTypes){
    		  System.out.print(class1.getName()+",");
    		  
    	  }
    	  System.out.println(")");
   
      }
      
      
     
      
	  
	  System.out.println("��Ա���� ");
	  
//	  printFieldMessage(c);
			 
			 
      
    	
    }

	public static void printFieldMessage(Object object) {
		
		Class c=object.getClass();
		/*
		   * ��Ա����Ҳ�Ƕ���
		   * java.lang.reflect.Field
		   * Field���װ�˹��ڳ�Ա�����Ĳ���
		   * getFields()������ȡ�������е�public�ĳ�Ա��������Ϣ
		   * getDeclaredFileds��ȡ���Ǹ����Լ������ĳ�Ա��������Ϣ
		   * */
		  
		  
//	 Field[] fs=c.getFields();
		 Field[] fs=c.getDeclaredFields();
		 
		 for(Field field:fs){
			 
			 //�õ���Ա���������͵�������
			 Class fieldType=field.getType();
			 String typeName=fieldType.getName();
			 
			 //�õ���Ա����������
			 String fieldName=field.getName();
			 System.out.println(typeName+" "+fieldName );
			 
		 }
		 
		}	

	   
	     /**
	     * @param ��ӡ����Ĺ��캯������Ϣ
	     */
	    public static void printConMessage(Object obj){
	    	
	    	Class c=obj.getClass();
	    	/*
	    	 * ���캯��Ҳ�Ƕ���
	    	 * java.lang.Constructor �з�װ�˹��캯������Ϣ
	    	 * getConstructors ��ȡ�����е�public �Ĺ��캯��
	    	 * 
	    	 * */
	    	
//	    	Constructor[] cs=c.getConstructors();
	    	Constructor[] cs=c.getDeclaredConstructors();
	    	
	    	for(Constructor constructor :cs){
             
	    		System.out.print(constructor.getName()+"(");
	    	    //��ȡ���캯���Ĳ����б�---���õ������б��������
	    		
	    		Class[] paramTypes=	constructor.getParameterTypes();
	    		for(Class class1:paramTypes){
	    			System.out.print(class1.getName()+" ");
	    			
	    		}
	    				
	    		
	    		System.out.println(")");		
	    	}
		   
	   }
	
	
	
}
