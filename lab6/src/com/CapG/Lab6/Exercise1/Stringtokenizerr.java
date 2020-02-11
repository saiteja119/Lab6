package com.CapG.Lab6.Exercise1;
import java.util.*;
public class Stringtokenizerr {
	void displayResult(String str1)
	{
		StringTokenizer str =new StringTokenizer(str1,":");
		int data ;
		int res=0;
		while(str.hasMoreTokens())
		{
			data= Integer.parseInt(str.nextToken());
			System.out.println(data);
			res+=data;
		}
		System.out.println(res);
	}
}