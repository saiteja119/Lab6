package com.CapG.Lab6.Exercise8;

public class PositiveString {
	boolean positive(String str)
	{
		int count=0;
		for(int loop=0;loop<str.length()-1;loop++)
		{
			if(str.charAt(loop+1)>str.charAt(loop))
			{
				count=count+1;
			}
		}
		if(count==(str.length()-1))
		{
			return true;
		}
		return false;
	}
}