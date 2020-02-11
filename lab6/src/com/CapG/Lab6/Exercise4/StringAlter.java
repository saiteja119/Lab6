package com.CapG.Lab6.Exercise4;
public class StringAlter {
	String alterString(String str)
	{
		char ch[] = str.toCharArray();
		for(int insert=0;insert<ch.length;insert++)
		{
			if(ch[insert]!='a' && ch[insert]!='e' && ch[insert]!='i' && ch[insert]!='o' && ch[insert] != 'u')
			{
				ch[insert]++;
			}
		}
		return String.valueOf(ch);
	}
}