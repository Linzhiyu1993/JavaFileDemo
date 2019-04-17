package com.rl.File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args)
    {
    	
    }
    public static void reNameFile() throws IOException
    {
    	File fileb=new File("c.txt");
    	fileb.createNewFile();
    }
}
