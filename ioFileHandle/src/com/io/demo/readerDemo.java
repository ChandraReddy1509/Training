package com.io.demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class readerDemo {

		public static void main(String[] args) {

			InputStreamReader ir = null;

			BufferedReader br = null;

			FileWriter fw = null;

			FileWriter fh = null;

			

			ir = new InputStreamReader(System.in);

			br = new BufferedReader(ir);

			

			

			System.out.println("Enter a String:");

			

			try {

				

				fw = new FileWriter("myname.txt");

				fh = new FileWriter("myadd.txt");

				String str = br.readLine();

				String str2 = br.readLine();

	            System.out.println(str);

	            System.out.println(str2);

	            fw.write(str);

	            fh.write(str2);

		}catch (IOException e) {

			

			    e.printStackTrace();

			}

			finally {

				

				try {

					ir.close();

					fw.close();

					br.close();

					fh.close();

					

				} catch (IOException e) {

					

					e.printStackTrace();

				}

				

				

			

			}

		}

		

	}

	 