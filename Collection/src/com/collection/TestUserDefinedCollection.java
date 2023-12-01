package com.collection;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestUserDefinedCollection {
	public static void displayProducts(List<ProductCol> plist) {
		//System.out.println("product data :") ;
		for (ProductCol p:plist) {
			System.out.println("product is:"+ p);
		}
	}
	
	public static ArrayList<ProductCol> buildList(){

	//public static void main(String[] args) {
		ArrayList<ProductCol> plist=new ArrayList<>();
		
		
		ProductCol p1=new ProductCol(100,"pen",100,50.0) ;
		ProductCol p2=new ProductCol(101,"pen1",100,50.0) ;
		ProductCol p3=new ProductCol(102,"pen3",100,50.0) ;
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		return plist;
		
		
}
public static void searchCode(int productCode,List<ProductCol> plist) {
for(ProductCol p:plist) {
	if(p.getProductCode() == productCode) {
		System.out.println("Product availaiable:"+ p.getProductName());
	}
	else {
		System.out.println("Product not availaible:"+p.getProductName());
	}
	}
}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("vhgvfgh");
			int p=sc.nextInt();
			List<ProductCol> pList=buildList();
			displayProducts(pList);
		searchCode(p, pList);
		//Collections.sort(pList);
			System.out.println(pList);
			

			}
}

		
		