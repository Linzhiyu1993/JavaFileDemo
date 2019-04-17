package com.rl.File;

import java.io.File;

public class FileDemo5 {
   public static void main(String[] args)
   {
	   File file=new File("D:\\nodejs");
	   listFile(file);
   }
   public static void listFile(File file)
   {
	   File[] files=file.listFiles();
	   for(File file1:files)
	   {
		   if(file1.isDirectory())
		   {
			   listFile(file1);
		   }
		   else{
			   String fileName=file1.getName();
			   //判断文件类型
			   if(fileName.lastIndexOf(".java")!=-1)
			   {
				   System.out.println(fileName);
			   }
		   }
	   }
   }
}
