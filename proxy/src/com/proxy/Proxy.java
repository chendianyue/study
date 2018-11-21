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
		String rt="\r\n";//widows 下的换行符
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
		 * 聚合的方式： 一个类调用另一个对象
		 * 
		 * */
		  methodStr
	/*	"	public void move(){"+rt+        
		"		 long time1=System.currentTimeMillis();"+rt+
		"		 System.out.println(\"汽车开始行驶------\");"+rt+
		"	       m.move();"+rt+
		"	      long time2=System.currentTimeMillis();"+rt+
		"		 System.out.println(\"汽车结束行驶-----行驶时间：\"+(time2-time1)+\"毫秒\");"+rt+
				
		"	}"*/
		
		+rt+
			
		"}";
         byte[] strbytes=str.getBytes();
         //产生代理类的java文件
		 String filename=System.getProperty("user.dir")+"/bin/com/proxy/$Proxy0.java";
		 String location=System.getProperty("user.dir")+"/bin/com/proxy";
		 File file=new File(filename);
		 System.out.println("文件路径:"+filename);
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
		 //编译 拿到编译器
		 JavaCompiler complier=ToolProvider.getSystemJavaCompiler();
		 StandardJavaFileManager fileMgr=
				 complier.getStandardFileManager(null, null, null);
		 //获取文件
		 Iterable units=fileMgr.getJavaFileObjects(filename);
		 //编译任务
		 CompilationTask t=
				 complier.getTask(null, fileMgr, null, null, null, units);
		//进行编译
		 t.call();
		 try {
			fileMgr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //生成的class 文件load 到内存当中
		 ClassLoader cl=ClassLoader.getSystemClassLoader();
		 Class c=null;
		 try {
			c=cl.loadClass("com.proxy.$Proxy0");
			System.out.println("加载的类的名字："+c.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 //创建代理类 返回
		 Constructor ctr=c.getConstructor(InvocationHandler.class);
		
		 
		 
		 
		 return ctr.newInstance(h);
	
	} 

}
