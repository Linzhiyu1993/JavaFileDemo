package com.rl.File;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException
	{
		/**
		 * 创建文件
		 */
		//创建File对象
		File file=new File("d:/a.txt");
		//创建文件,如果文件已经存在则会创建失败
		boolean isSuccessa=file.createNewFile();
		System.out.println(isSuccessa);
		
		System.out.println("----------------------------");
		//使用相对路径来创建文件:直接在当前的工程目录下
		File file1=new File("a.txt");
		//根据相对路径在项目工程中来创建文件
		File file2=new File("src/com/rl/File/b.txt");
		boolean isSuccessb=file1.createNewFile();
		System.out.println(isSuccessb);
		
		System.out.println("----------------------------");
		/**
		 * 创建文件夹
		 */
		//创建文件夹
		File folder=new File("a");
		boolean isSuccess=folder.mkdir();//判断文件夹是否创建成功
		System.out.println(isSuccess);
		
		File folder1=new File("c/a/b");
		//mkdir是单级目录的创建
		boolean isSuccess1=folder1.mkdir();//判断文件夹是否创建成功
		System.out.println(isSuccess1);
	}
}
