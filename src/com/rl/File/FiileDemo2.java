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
	   //��������ļ������ڻ����ļ����ڱ�ʹ�þ���false,�������true
	   System.out.println("�ļ��Ƿ�ɾ����"+isdelete);
	   
	   File filec=new File("src/com/rl/File/c.txt");
	   boolean isdelete1=filec.delete();
	   System.out.println("�ļ��Ƿ�ɾ����"+isdelete1);
	   
	   
	   System.out.println("-------------------------------------");
	   //Ŀ¼ɾ��ʱ��ɾ���ļ���ɾĿ¼
	   File filed=new File("src/a/b");
	   boolean isdeleteFolder=filed.delete();
	   System.out.println("�ļ����Ƿ�ɾ����"+isdeleteFolder);
   }
}
