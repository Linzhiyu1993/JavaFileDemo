package com.rl.File;

import java.io.File;

public class FileDemo {
	public static void main(String[] args)
	{
		File file=new File("D:\\demo.txt");
		File file1=new File("D:/demo.txt");
		System.out.println(file1);
		
		//�����ļ��ĵڶ��ַ�ʽ����һ���������ļ����ڵ�·�����ڶ����������ļ���
		File file2=new File("D:\\","demo.txt");
		System.out.println(file2);
		
		//��java�У����ļ����ļ��ж�����ΪFile��
		//����һ���ļ��е�File����
		File fileDir=new File("d:/");
		File file3=new File(fileDir,"demo.txt");
		System.out.println(file3);
	}

}
