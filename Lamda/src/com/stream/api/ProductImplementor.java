package com.stream.api;

public class ProductImplementor {
	
	
	public static void main(String[] args) {
		Calculator c= () ->{
			int result=1;
			for (int i=1;i<=10;i++) {
				result =result*i;
			}
		
		return result ;
	};
	System.out.println(c.product());
	}
}
				
			
			
		

		
	


