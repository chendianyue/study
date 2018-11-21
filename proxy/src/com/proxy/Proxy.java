package com.proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class Proxy {
	
	public  static Object newProxyInstance(Class inface,InvocationHandler h) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		String rt="\r\n";//widows �µĻ��з�
		String methodStr="";
		for(Method m:inface.getMethods()){
			methodStr+=
			"	public void "+m.getName()+"(){"+rt+        
			"try{"+rt+
			"   Method md=" +inface.getName()+".class.getMethod(\""+
					m.getName()+"\");"+rt+
		    "h.invoke(md);"+rt+

		    
		    
		    
		    "}catch(Exception e){e.printStackTrace();}"+rt+		
			"}";
			
		}  
		String str=
		"package com.proxy;"+rt+
		"import com.proxy.InvocationHandler;"+rt+
		"import java.lang.reflect.Method;"+rt+

		"public class $Proxy0 implements "+inface.getName()+"{"+rt+
		
		 "   private InvocationHandler h;"+rt+
			
			
			

		 


		"	public $Proxy0(InvocationHandler h){"+rt+
		 "   	this.h=h;"+rt+
		  " }"+rt+


			/*
		 * �ۺϵķ�ʽ�� һ���������һ������
		 * 
		 * */
		  methodStr
	/*	"	public void move(){"+rt+        
		"		 long time1=System.currentTimeMillis();"+rt+
		"		 System.out.println(\"������ʼ��ʻ------\");"+rt+
		"	       m.move();"+rt+
		"	      long time2=System.currentTimeMillis();"+rt+
		"		 System.out.println(\"����������ʻ-----��ʻʱ�䣺\"+(time2-time1)+\"����\");"+rt+
				
		"	}"*/
		
		+rt+
			
		"}";
         byte[] strbytes=str.getBytes();
         //�����������java�ļ�
		 String filename=System.getProperty("user.dir")+"/bin/com/proxy/$Proxy0.java";
		 String location=System.getProperty("user.dir")+"/bin/com/proxy";
		 File file=new File(filename);
		 System.out.println("�ļ�·��:"+filename);
		 try {
			FileOutputStream out=new FileOutputStream(file);
			try {
				out.write(strbytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //���� �õ�������
		 JavaCompiler complier=ToolProvider.getSystemJavaCompiler();
		 StandardJavaFileManager fileMgr=
				 complier.getStandardFileManager(null, null, null);
		 //��ȡ�ļ�
		 Iterable units=fileMgr.getJavaFileObjects(filename);
		 //��������
		 CompilationTask t=
				 complier.getTask(null, fileMgr, null, null, null, units);
		//���б���
		 t.call();
		 try {
			fileMgr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //���ɵ�class �ļ�load ���ڴ浱��
		 ClassLoader cl=ClassLoader.getSystemClassLoader();
		 Class c=null;
		 try {
			c=cl.loadClass("com.proxy.$Proxy0");
			System.out.println("���ص�������֣�"+c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 //���������� ����
		 Constructor ctr=c.getConstructor(InvocationHandler.class);
		
		 
		 
		 
		 return ctr.newInstance(h);
	
	} 

}
