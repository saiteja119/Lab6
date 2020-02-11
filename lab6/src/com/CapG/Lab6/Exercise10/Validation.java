package com.CapG.Lab6.Exercise10;
public class Validation {
	boolean valid(String userName)
	{
		if(userName.endsWith("_job") && userName.length()>=12)
		{
			return true;
		}
		return false;
	}
}
