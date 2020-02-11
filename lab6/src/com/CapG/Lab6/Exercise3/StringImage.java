package com.CapG.Lab6.Exercise3;

public class StringImage {
	String imageString(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		StringBuffer temp=sb.reverse();
		return (temp.toString());
	}
}
