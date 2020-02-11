package com.CapG.Lab6.Exercise5;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	ModifyNum mn =new ModifyNum();
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	String str = Integer.toString(num);
	System.out.println(mn.Modify(str));
	}
}