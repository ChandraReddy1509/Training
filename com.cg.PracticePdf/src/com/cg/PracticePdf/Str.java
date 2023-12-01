package com.cg.PracticePdf;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Str {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);

		int monthNumber = LocalDate.now().getMonthValue();
		String monthString = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

		System.out.println(monthNumber + " " +monthString);

		int dayNumber = LocalDate.now().getDayOfMonth();

		System.out.println(dayNumber );
	}

}
