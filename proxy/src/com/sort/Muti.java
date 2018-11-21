package com.sort;
/*
 * 移位操作代替乘法操作
 * 针对2的倍数 因为乘以16 相当于左移4位
 * */
public class Muti {
	public static int powerN(int m,int n){
		for(int i=0;i<n;i++){
			m=m<<1;
		}
		return m;
	}
	public static boolean isPower(int n){
		if(n<1) 
			return false;
		int i=1;
		while(i<=n){
			 if(i==n)
				 return true;
			 i<<=1;
			 
		}
		
		return false;
		
	}
	
	public static boolean isPower1(int n){
		if(n<1)
			return false;
		
		int m=n&(n-1);
		return m==0;
		
		
	}
	
	public static int countOne(int n){
		int count=0;
		while(n>0){
			if((n&1)==1)
				count++;
		  n=n>>1;
		}
		
		return count;
	}
	
	public static int countOne1(int n){
		int count =0;
		while(n>0){
			 n=n&(n-1);
			 count++;
		}
		 return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println("3 * 8 ="+powerN(3,3));
		System.out.println("3 * 16 ="+powerN(3,4));
		
		System.out.println("是否是2的次方 ："+isPower(4));
		System.out.println("是否是2的次方1："+isPower1(5));
		System.out.println("是否是2的次方1："+isPower1(4));
		
		System.out.println("countOne1 :"+countOne1(7));
		
	}
		
		

}
