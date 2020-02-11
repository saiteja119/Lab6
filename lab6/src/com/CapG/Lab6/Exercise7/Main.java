package com.CapG.Lab6.Exercise7;
import java.io.File;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fname = sc.next();
		File f1 =new File(fname);
		System.out.println("This file "+(f1.exists()?"Exits":"Doesn't Exits"));
		System.out.println("Is readable:"+f1.canRead());
		System.out.println("Is writeable:"+f1.canWrite());
		System.out.println("File Size "+f1.length()+" bytes"); 
	
	}
}
