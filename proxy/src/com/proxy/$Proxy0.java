package com.proxy;
import com.proxy.InvocationHandler;
import java.lang.reflect.Method;
public class $Proxy0 implements com.proxy.Moveable{
   private InvocationHandler h;
	public $Proxy0(InvocationHandler h){
   	this.h=h;
 }
	public void move(){
try{
   Method md=com.proxy.Moveable.class.getMethod("move");
   h.invoke(md);
}catch(Exception e){e.printStackTrace();}
}
}