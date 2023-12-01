package com.junit.entity;

public class StringTest {


	public  String concatenateString(String str1 , String str2)

	{

		return str1.concat(str2);

	}

	public int checkLength(String str)

	{

		return str.length();

	}
	public String reverseString(String str)

	{

		StringBuilder sb = new StringBuilder(str);

		return sb.reverse().toString();

	}
}