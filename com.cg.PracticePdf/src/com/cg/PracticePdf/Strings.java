package com.cg.PracticePdf;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Strings {

	public static void main(String[] args) {
		

			//Current System Date

			LocalDate date = LocalDate.now();

			System.out.println(date);

			

			//Current System Time

			LocalTime time = LocalTime.now();

			System.out.println(time);

			

			//current month

			int monthNumber = LocalDate.now().getMonthValue();

			

			String monthString = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);

			//System.out.println(monthNumber + " " +monthString);

			//today day

			int dayNumber = LocalDate.now().getDayOfMonth();

			System.out.println(dayNumber );

			
	}

}
