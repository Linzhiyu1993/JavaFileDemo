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
	   //ɾ��ָ���ļ����µ������ļ���������Ŀ¼
	   if(!file.exists())
	   {
		   return false;
	   }
	   if(file.isFile())
	   {
		   return false;
	   }
	   else {
		   //���Ŀ¼�µ������ļ�����
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
