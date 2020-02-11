package com.CapG.Lab6.Exercise3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringImage si = new StringImage();
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		System.out.println(str+"|"+si.imageString(str));
	}

}
