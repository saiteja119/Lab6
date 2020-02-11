package com.CapG.Lab6.Exercise10;
import java.util.Scanner;
public class MainValid {
	public static void main(String[] args) {
	Validation v = new Validation();
	Scanner sc =new Scanner(System.in);
	String userName =sc.next();
	System.out.println(v.valid(userName));
	sc.close();
	}
}
