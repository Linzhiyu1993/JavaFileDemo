package com.rl.File;

import java.io.File;

public class FileDemo8 {
   public static void main(String[] args)
   {
	   File file=new File("E:\\a");
	   deleteFolder(file);
   }
   //ɾ�����ļ���,ɾ����Ŀ¼�µ������ļ���
   public static void deleteFolder(File file)
   {
	   deleteFile(file);
	   file.delete();
//	   if(!file.exists())
//	   {return false;}
//	   if(file.isFile()) {return false;}
//	   else {
//		   File[] files=file.listFiles();
//		   for (File file1:files)
//		   {
//			   if(file1.isDirectory())
//			   {
//				   deleteFile(file);
//			   }
//			   else {file1.delete();}
//		   }
//	   }
//	   return true;
   }
   //ɾ�������ļ�
   public static boolean deleteFile(File file)
   {
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
			   file1.delete();
			   if(file1.isFile())
			   {
				   file1.delete();
			   }
			   else if(file1.isDirectory())
			   {deleteFolder(file1);}
		   }
	   }
	   return true;
   }
   
}
