package com.cg.PracticePdf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection2 {


  public  List<Integer> getreversedList(List<Integer> l1){
	
	List<Integer> reversedList=new ArrayList<>(l1);
	Collections .reverse(reversedList);
	return reversedList;
}
public static List<Integer>getOrderedList(List<Integer> l2){
	
	List<Integer> orderedList=new ArrayList<>(l2);
	Collections .reverse(orderedList);
	return orderedList;
}

public static List<Integer> getExactMidNumber(List<Integer> l1){
	if(l1.isEmpty()) {
		throw new IllegalArgumentException("List is empty");

	List<Integer> sortedList=new ArrayList<>(l1);
	Collections.sort(sortedList);
	
	int size=sortedList.size();
}
	int size;
	List<Integer> sortedList;
	if(size % 2==1) {
		int midIndex = size/2;
		return Collection.singletonList(sortedList.get(midIndex));
		
}else {
	int midIndex1=size/2-1;
	int midIndex2=size/2;
	return singletonList(Math.max(sortedList.get(midIndex1), sortedList.get(midIndex2)));
}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
