package com.rl.File;

import java.io.File;

public class FileDemo {
	public static void main(String[] args)
	{
		File file=new File("D:\\demo.txt");
		File file1=new File("D:/demo.txt");
		System.out.println(file1);
		
		//创建文件的第二种方式，第一个参数是文件所在的路径，第二个参数是文件名
		File file2=new File("D:\\","demo.txt");
		System.out.println(file2);
		
		//在java中，把文件和文件夹都抽象为File类
		//创建一个文件夹的File对象
		File fileDir=new File("d:/");
		File file3=new File(fileDir,"demo.txt");
		System.out.println(file3);
	}

}
