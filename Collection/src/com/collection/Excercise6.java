package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map.Entry;

public class Excercise6 {
	public static List<Integer> getVoter (HashMap<Integer, Integer> vid ){
		ArrayList<Integer> val=new ArrayList<Integer>();
		//List<Integer> value=new ArrayList<>();
		for(Entry<Integer,Integer> entry:  vid.entrySet()) {
			if(entry.getValue()>18) {
				val.add(entry.getKey());
			}
			
			}
		return val;	
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> vid=new HashMap();
		vid.put(18, 18);
		vid.put(181, 17);
		vid.put(1811, 19);
		vid.put(1823, 11);
		//System.out.println(vid);
		List<Integer> ageValid=getVoter (vid);
		System.out.println(ageValid);
		
		
		

	}

}
