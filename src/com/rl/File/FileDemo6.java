package com.rl.File;

import java.io.File;

public class FileDemo6 {
   public static void main(String[] args)
   {
	   File file=new File("E:\\a");
	   deleteFile(file);
   }
   public static boolean deleteFile(File file)
   {
	   //删除指定文件夹下的所有文件，不包括目录
	   if(!file.exists())
	   {
		   return false;
	   }
	   if(file.isFile())
	   {
		   return false;
	   }
	   else {
		   //获得目录下的所有文件对象
		   File[] files=file.listFiles();
		   for(File file1:files)
		   {
			   if(file1.isFile())
			   {
				   file1.delete();
			   }
			   else{deleteFile(file1);};
		   }
	   }
	   return true;
   }
}
