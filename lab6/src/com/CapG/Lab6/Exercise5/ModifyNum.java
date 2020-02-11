package com.CapG.Lab6.Exercise5;

public class ModifyNum {
	int Modify(String str)
	{
		int x;
		StringBuffer sb = new StringBuffer();
		for(int loop=0;loop<str.length()-1;loop++)
		{
			x=str.charAt(loop) - str.charAt(loop+1);
			sb.append(Math.abs(x));
		}
		sb.append(str.charAt(str.length()-1));
		int res =Integer.parseInt((sb.toString()));
		return res;
	}
}