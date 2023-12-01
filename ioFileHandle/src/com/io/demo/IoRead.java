package com.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoRead {

public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("C:\\javacapgemini\\Demo.java");
			int data = 0;
			while ((data=fi.read()) != -1) {
			System.out.print((char)data);
			}
		} catch (FileNotFoundException e)

		{
			e.printStackTrace();

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
		}
		finally {
			try
			{
				fi.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();

			}

		}

	}

 

}