package com.collection;

import java.util.HashMap;
import java.util.Map;

public class Count {
	public static Map<Character, Integer> countChar1(char[]arr) {
		Map<Character,Integer> e2=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			if(e2.containsKey(arr[i])) {
				e2.remove(arr[i]);
				count++;
				e2.put(arr[i], count);
			}else {
				e2.put(arr[i], count);

			}
		}
		return e2;
	}
	public static void main(String[] args) {
		char[]arr= {'a','b','a'};
		System.out.println(countChar1(arr));



	}

}
