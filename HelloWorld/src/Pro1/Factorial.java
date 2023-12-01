package Pro1;

import java.util.Scanner;

public class Factorial {
 
		 public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter number");
		int fac=sc.nextInt();
		
		  
		  for(i=1;i<=fac;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+fac+" is: "+fact);    
		 }  
		}  


