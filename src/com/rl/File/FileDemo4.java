package com.rl.File;

public class FileDemo4 {
   public static void main(String[] args)
   {
	   //用递归来实现阶乘
	   //method(3);
	   System.out.println("结果是："+f(3));
   }
   //5!=5*4! f(n)!=n*f(n-1)!

   static int result=1;
   public static int f(int n)
   {
//	   for(int i=1;i<=n;i++)
//	   {
//		   result=result*i; 
//	   }
	   /**
	           * 递归要有跳出的条件
	    */
	   if(n==1)
	   {return 1;}
	   else {return n*f(n-1);}
   }
}
