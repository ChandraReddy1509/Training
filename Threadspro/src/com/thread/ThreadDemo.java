package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		ArraySum as=new ArraySum("array thread");
		PrintNumbers pn =new PrintNumbers("number thread");//new born threads
		t.setName("main thread");
		//pn.isAlive();
		System.out.println(t);
			//main is name 
			//5 is priority;
			//group main
		//t.setName("Main Thread");
	//	t.setPriority(3);
		System.out.println(t);
		
//		for(int i=1;i<11;i++) {
//			System.out.println(i);
		//}
		for (int i=0;i<5;i++) {
		System.out.println("wskb");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
		//PrintNumbers pn =new PrintNumbers();//new born threads
		//pn.isAlive();
	}
}
