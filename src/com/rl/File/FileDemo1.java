package com.rl.File;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException
	{
		/**
		 * �����ļ�
		 */
		//����File����
		File file=new File("d:/a.txt");
		//�����ļ�,����ļ��Ѿ�������ᴴ��ʧ��
		boolean isSuccessa=file.createNewFile();
		System.out.println(isSuccessa);
		
		System.out.println("----------------------------");
		//ʹ�����·���������ļ�:ֱ���ڵ�ǰ�Ĺ���Ŀ¼��
		File file1=new File("a.txt");
		//�������·������Ŀ�������������ļ�
		File file2=new File("src/com/rl/File/b.txt");
		boolean isSuccessb=file1.createNewFile();
		System.out.println(isSuccessb);
		
		System.out.println("----------------------------");
		/**
		 * �����ļ���
		 */
		//�����ļ���
		File folder=new File("a");
		boolean isSuccess=folder.mkdir();//�ж��ļ����Ƿ񴴽��ɹ�
		System.out.println(isSuccess);
		
		File folder1=new File("c/a/b");
		//mkdir�ǵ���Ŀ¼�Ĵ���
		boolean isSuccess1=folder1.mkdir();//�ж��ļ����Ƿ񴴽��ɹ�
		System.out.println(isSuccess1);
	}
}
