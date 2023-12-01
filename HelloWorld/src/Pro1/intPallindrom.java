package Pro1;

import java.util.Scanner;

public class intPallindrom {

	public static void main(String[] args) {

	    int num,temp,i,rem;
 	    Scanner sc=new Scanner(System.in);
 	    System.out.println("Enter any number ");
        num=sc.nextInt();
        temp=num;
       for(i=0;num>0;num/=10)
       {
    	   rem=num%10;
    	   i=(i*10)+rem;
}
       if(i==temp)
    	   System.out.println(temp+" is a palindrome number ");
      else
    	  System.out.println(temp+" is not a palindrome number ");
      
}
}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
