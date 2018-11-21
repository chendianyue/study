package singleInstance;

public class Singleclass {
   public  static  Singleclass singleclass;
   public int a=9;
   private Singleclass(){
	   
   }
   
   
	
   public static Singleclass getInstance(){
	   if(singleclass==null){
		   singleclass=new Singleclass();
	   }
	   
	   return singleclass;
	   
	   
   }
   
	
}
