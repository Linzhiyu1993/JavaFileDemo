package com.rl.File;

public class FileDemo4 {
   public static void main(String[] args)
   {
	   //�õݹ���ʵ�ֽ׳�
	   //method(3);
	   System.out.println("����ǣ�"+f(3));
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
	           * �ݹ�Ҫ������������
	    */
	   if(n==1)
	   {return 1;}
	   else {return n*f(n-1);}
   }
}
