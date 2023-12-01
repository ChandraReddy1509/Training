package com.io.demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringRead {

	public static void main(String[] args) {
		FileReader fr1=null;
		FileReader fr2=null;
		BufferedReader br1=null;
		BufferedReader br2=null;
		String s1=null;
		String s2=null;
		boolean flag=true;
		
		try {
		fr1=new FileReader("C:javacapgemini.my.txt");
		fr2=new FileReader("C:javacapgemini.my.txt");
		br1=new BufferedReader(fr1);
		br2=new BufferedReader(fr2);
		
		while((s1=br1.readLine())  !=null && (s2=br2.readLine()) !=null){
			if(! s1.equals(s2)) {
				flag = false;
				break;
				
			}
		}
		if(flag==true && s1==null && s2==null) {
			System.out.println("same files");
		}
		else {
			System.out.println("not same");
		}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
