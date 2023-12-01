package Pro1;

import java.util.Scanner;

public class revInt {

	public static void main(String[] args) {
		int num,num1 = 0,rem,i;
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter number");
		 num=sc.nextInt();
		
		 
		 while (num != 0) {
	            rem = num % 10;
	            num1 = num1 * 10 + rem;
	            num /= 10;
	        }
		 System.out.println(num1);
		}
	
		
	}


