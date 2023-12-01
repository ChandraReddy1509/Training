package com.io.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StdIODemo {

	public static void main(String[] args) {
		FileInputStream bi=null;
		FileOutputStream fo=null;
		//System.out.println("enter character:");
		int data=0;
		try {
			bi=new FileInputStream("C:\\javacapgemini\\Demo.java");
			fo=new FileOutputStream("C:\\javacapgemini\\DemoCopy.java");
			
			
			do {
			data=bi.read();
			//if((char)data !='q'){
				//System.out.println((char)data);
				fo.write(data);
			
			}while((char)data !='q');
					
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
			bi.close();
			fo.close();
		}catch(IOException e){
			e.printStackTrace();
		}
			
		}
	}

}
