package com.thread;

public class PrintNumbers implements Runnable {
	Thread t;
	public PrintNumbers(String tname) {
		t=new Thread();
	t.setName(tname);
	
		t.start();//Ready to run;;
		
	}
	public void run() { //Runnable state
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			System.out.println(sum);
			System.out.println(t.getName());
			
			//System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
