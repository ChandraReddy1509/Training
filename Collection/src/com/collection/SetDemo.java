package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
TreeSet ts =new TreeSet();
ts.add(59);
ts.add(2222);
ts.add(11);
ts.add(11);

System.out.println(ts);
Iterator it=ts.iterator();
while(it.hasNext()) {
	int data=(int) it.next();
	System.out.println("data:"+data+"multiply:"+(data*2));
	
}

//for each
System.out.println("for each");
for(Object o : ts){
	//object type:ts
	int data=(int) o;
	System.out.println(data*2);
}
{

	}
	}
}
	
