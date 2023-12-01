package com.thread;

public class ArraySum extends  Thread{
	public  ArraySum(String tname) {
		start();
	}
	
	int arr[]= {1,2,3,4,5};
	
	public void run() {
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			//System.out.println(sum);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		System.out.println(sum);
}
}
