package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Iterator;

public class ArrayLst {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12);
		al.add(2);
		al.add(1111);
		
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext()) {
			int data=(int) it.next();
			System.out.println("data:"+data+"multiply:"+(data*2));
		}

	}
}
