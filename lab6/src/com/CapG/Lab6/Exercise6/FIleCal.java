package com.CapG.Lab6.Exercise6;
import java.io.*;
public class FIleCal {
	void cal(String str) throws IOException
	{
		FileInputStream fis = new FileInputStream(str);
		int data = 0;
		int lines =1;
		int words =1;
		int let=1;
		while(fis.available()!=0)
		{
			char ch = (char)fis.read();
			if(ch=='\n')
			{
				lines++;
			}
			if(ch==' '||ch=='\n')
			{
				words++;
			}
			else
			{
				let++;
			}
		}
		System.out.println("Lines:"+lines);
		System.out.println("Words:"+words);
		System.out.println("Characters:"+let);
	}
}
