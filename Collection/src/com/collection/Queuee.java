package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>(); 
		q.add(12);
		q.remove(12);
		q.add(111);
		System.out.println(q);
		

	}

}
