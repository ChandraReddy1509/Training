package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class getValues {
	
	public List<Double> getSortdVal(Map<String,Double> map){
		List<Double> valueList=new ArrayList<>(map.values());
		Collections.sort(valueList);
		return valueList;
	}
	public static void main(String[] args) {
		
		Map<String , Double> salaries = new HashMap<>();
		salaries.put("raj", 1000.0);
		salaries.put("raj1", 50002.0);
		salaries.put("raj2", 30003.0);
//		
//		List<Double> sortedSalaries=getSortdVal(salaries);
//		System.out.println("sorted salaries:" + sortedSalaries);
		 getValues g = new getValues();
		 System.out.println(g.getSortdVal(salaries));
	

	}

}
