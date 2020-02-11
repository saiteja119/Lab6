package com.CapG.Lab6.Exercise9;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Dateformat {

	public static void main(String[] args) {
		LocalDate randomDate = LocalDate.of(2010,6,9);
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date:"+currentDate);
		System.out.println("Random Date:"+randomDate);
		Period p = Period.between(randomDate, currentDate);
		System.out.println(p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
	}
}