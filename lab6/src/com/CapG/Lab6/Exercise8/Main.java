package com.CapG.Lab6.Exercise8;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		PositiveString ps =new PositiveString();
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(ps.positive(str));
	}
}