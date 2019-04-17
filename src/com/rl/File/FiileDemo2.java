package com.rl.File;

import java.io.File;

public class FiileDemo2 {
   public static void main(String[] args)
   {
	   deleteFile();
   }
   public static void deleteFile()
   {
	   File fileb=new File("b.txt");
	   boolean isdelete=fileb.delete();
	   //如果本身文件不存在或者文件正在被使用就是false,否则就是true
	   System.out.println("文件是否删除："+isdelete);
	   
	   File filec=new File("src/com/rl/File/c.txt");
	   boolean isdelete1=filec.delete();
	   System.out.println("文件是否删除："+isdelete1);
	   
	   
	   System.out.println("-------------------------------------");
	   //目录删除时先删除文件再删目录
	   File filed=new File("src/a/b");
	   boolean isdeleteFolder=filed.delete();
	   System.out.println("文件夹是否删除："+isdeleteFolder);
   }
}
