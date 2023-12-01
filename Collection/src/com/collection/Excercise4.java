package com.collection;

import java.util.HashMap;  
import java.util.Map.Entry;

public class Excercise4 {
	public static HashMap<Integer,String> getStudent(HashMap<Integer,Integer> sm){
		HashMap<Integer,String> values=new HashMap<Integer,String>();
	    for( Entry<Integer, Integer> entry:sm.entrySet()) {
		      if(entry.getValue()>=90) {
		    	  values.put(entry.getKey(), "Gold");
		      }
		      else if(entry.getValue()>=80 & entry.getValue()<90) {
		    	  
		    	  values.put(entry.getKey(), "Silver");
		      }
		      else if(entry.getValue()>=70 & entry.getValue()<80) {
		    	  
		    	  values.put(entry.getKey(), "Bronze");
		      }
		      else {
		    	  values.put(entry.getKey(), "No Medals");
		      }
		
	}
	    return values;
	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> sm=new HashMap();
		sm.put(101, 80); sm.put(102, 90); sm.put(103, 60);
		HashMap<Integer,String> medals=getStudent(sm);
		System.out.println(medals);
		
	}

}
