package com.cg.PracticePdf;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pass {
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Password");
			String password = sc.nextLine();
			boolean startWithCapital = Pattern.compile("^[A-Z].*").matcher(password).matches();
			boolean containDigit = Pattern.compile(".*\\d+.*").matcher(password).matches();
			boolean endWithSpecialChar = Pattern.compile(".*[-$@]$").matcher(password).matches();


if(startWithCapital&&containDigit&&endWithSpecialChar) {
			System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
}
		}

	}
}
