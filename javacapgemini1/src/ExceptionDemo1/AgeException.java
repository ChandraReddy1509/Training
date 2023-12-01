package ExceptionDemo1;

import java.util.Scanner;

class AgeValid extends Exception{
	public AgeValid(String a) {
	System.out.println(a);
	}
	
	
}
public class AgeException {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int Age=sc.nextInt();
		
		try {
			if(Age<=15)
				throw new AgeValid ("invalid");
		else {
			System.out.println("valid"+  Age);
		}
		
		}catch (Exception e){
			System.out.println("enter valid age");
		}
	}

}
