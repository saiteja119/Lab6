package com.CapG.Lab6.Exercise2;

import java.io.*;

public class FIleLine {
	void fileinfo(String str) throws Exception
	{
		FileInputStream fis = new FileInputStream(str);
		int i=1;
		char ch;
		int n =fis.available();
		System.out.print(i+++":");
		for(int loop=0;loop<n;loop++)
		{
			ch=(char)fis.read();
			System.out.print(ch);
			if(ch == '\n')
			{
				System.out.print((i++)+":");
			}
		}
	}
}
