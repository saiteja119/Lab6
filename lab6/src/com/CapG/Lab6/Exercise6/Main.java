package com.CapG.Lab6.Exercise6;
import java.io.IOException;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		FIleCal fc =new FIleCal();
		fc.cal(str);
	}
}
//file name text.txt